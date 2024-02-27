/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../..";
import * as FernOpenapiIr from "../../../../api";
import * as core from "../../../../core";

export const AllOfPropertyConflict: core.serialization.ObjectSchema<
    serializers.AllOfPropertyConflict.Raw,
    FernOpenapiIr.AllOfPropertyConflict
> = core.serialization.objectWithoutOptionalProperties({
    propertyKey: core.serialization.string(),
    allOfSchemaIds: core.serialization.list(core.serialization.lazy(async () => (await import("../../..")).SchemaId)),
    conflictingTypeSignatures: core.serialization.boolean(),
});

export declare namespace AllOfPropertyConflict {
    interface Raw {
        propertyKey: string;
        allOfSchemaIds: serializers.SchemaId.Raw[];
        conflictingTypeSignatures: boolean;
    }
}