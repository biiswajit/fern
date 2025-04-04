/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../../../index";
import * as SeedExhaustive from "../../../../../../api/index";
import * as core from "../../../../../../core";
import { Error_ } from "./Error_";

export const PutResponse: core.serialization.ObjectSchema<
    serializers.endpoints.PutResponse.Raw,
    SeedExhaustive.endpoints.PutResponse
> = core.serialization.object({
    errors: core.serialization.list(Error_).optional(),
});

export declare namespace PutResponse {
    export interface Raw {
        errors?: Error_.Raw[] | null;
    }
}
