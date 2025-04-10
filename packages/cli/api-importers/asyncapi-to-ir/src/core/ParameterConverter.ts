import { OpenAPIV3_1 } from "openapi-types";

import {
    ContainerType,
    HttpHeader,
    PathParameter,
    PrimitiveTypeV2,
    QueryParameter,
    TypeDeclaration,
    TypeId,
    TypeReference
} from "@fern-api/ir-sdk";
import { AbstractConverter, Converters, ErrorCollector } from "@fern-api/v2-importer-commons";

import { AsyncAPIConverterContext } from "../AsyncAPIConverterContext";

export declare namespace ParameterConverter {
    export interface Args extends AbstractConverter.Args {
        parameter: OpenAPIV3_1.ParameterObject;
    }
    export interface BaseParameterOutput {
        inlinedTypes?: Record<TypeId, TypeDeclaration>;
    }

    export interface QueryParameterOutput extends BaseParameterOutput {
        type: "query";
        parameter: QueryParameter;
    }

    export interface HeaderParameterOutput extends BaseParameterOutput {
        type: "header";
        parameter: HttpHeader;
    }

    export interface PathParameterOutput extends BaseParameterOutput {
        type: "path";
        parameter: PathParameter;
    }

    export type Output = QueryParameterOutput | HeaderParameterOutput | PathParameterOutput;
}

export class ParameterConverter extends AbstractConverter<AsyncAPIConverterContext, ParameterConverter.Output> {
    public static STRING = TypeReference.primitive({
        v1: "STRING",
        v2: PrimitiveTypeV2.string({
            default: undefined,
            validation: undefined
        })
    });

    public static OPTIONAL_STRING = TypeReference.container(ContainerType.optional(ParameterConverter.STRING));

    private readonly parameter: OpenAPIV3_1.ParameterObject;

    constructor({ breadcrumbs, parameter }: ParameterConverter.Args) {
        super({ breadcrumbs });
        this.parameter = parameter;
    }

    public async convert({
        context,
        errorCollector
    }: {
        context: AsyncAPIConverterContext;
        errorCollector: ErrorCollector;
    }): Promise<ParameterConverter.Output | undefined> {
        let typeReference: TypeReference | undefined;
        let inlinedTypes: Record<TypeId, TypeDeclaration> = {};

        if (this.parameter.schema != null) {
            const schemaOrReferenceConverter = new Converters.SchemaConverters.SchemaOrReferenceConverter({
                breadcrumbs: [...this.breadcrumbs, "schema"],
                schemaOrReference: this.parameter.schema,
                wrapAsOptional: this.parameter.required == null || !this.parameter.required
            });
            const converted = await schemaOrReferenceConverter.convert({ context, errorCollector });
            if (converted != null) {
                typeReference = converted.type;
                inlinedTypes = converted.inlinedTypes ?? {};
            }
        }
        // TODO (Eden): Correctly handle enum parameters

        const availability = await context.getAvailability({
            node: this.parameter,
            breadcrumbs: this.breadcrumbs,
            errorCollector
        });

        switch (this.parameter.in) {
            case "query":
                return {
                    type: "query",
                    parameter: {
                        name: context.casingsGenerator.generateNameAndWireValue({
                            name: this.parameter.name,
                            wireValue: this.parameter.name
                        }),
                        docs: this.parameter.description,
                        valueType:
                            typeReference ??
                            (this.parameter.required ? ParameterConverter.STRING : ParameterConverter.OPTIONAL_STRING),
                        allowMultiple: this.parameter.explode ?? false,
                        availability
                    },
                    inlinedTypes
                };
            case "header":
                return {
                    type: "header",
                    parameter: {
                        name: context.casingsGenerator.generateNameAndWireValue({
                            name: this.parameter.name,
                            wireValue: this.parameter.name
                        }),
                        docs: this.parameter.description,
                        valueType:
                            typeReference ??
                            (this.parameter.required ? ParameterConverter.STRING : ParameterConverter.OPTIONAL_STRING),
                        env: undefined,
                        availability
                    },
                    inlinedTypes
                };
            case "path":
                return {
                    type: "path",
                    parameter: {
                        name: context.casingsGenerator.generateName(this.parameter.name),
                        docs: this.parameter.description,
                        valueType:
                            typeReference ??
                            (this.parameter.required ? ParameterConverter.STRING : ParameterConverter.OPTIONAL_STRING),
                        location: "ENDPOINT",
                        variable: undefined
                    },
                    inlinedTypes
                };
            default:
                errorCollector.collect({
                    message: `Unsupported parameter location: ${this.parameter.in}`,
                    path: this.breadcrumbs
                });
                return undefined;
        }
    }
}
