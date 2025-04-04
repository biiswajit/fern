/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernIr from "../../../../api/index";
import * as core from "../../../../core";
import { DeclaredErrorName } from "../../errors/types/DeclaredErrorName";

export const ExampleEndpointErrorResponse: core.serialization.ObjectSchema<
    serializers.ExampleEndpointErrorResponse.Raw,
    FernIr.ExampleEndpointErrorResponse
> = core.serialization.objectWithoutOptionalProperties({
    error: DeclaredErrorName,
    body: core.serialization.lazyObject(() => serializers.ExampleTypeReference).optional(),
});

export declare namespace ExampleEndpointErrorResponse {
    export interface Raw {
        error: DeclaredErrorName.Raw;
        body?: serializers.ExampleTypeReference.Raw | null;
    }
}
