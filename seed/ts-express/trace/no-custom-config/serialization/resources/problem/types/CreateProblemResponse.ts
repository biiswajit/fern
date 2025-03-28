/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedTrace from "../../../../api/index";
import * as core from "../../../../core";

export const CreateProblemResponse: core.serialization.Schema<
    serializers.CreateProblemResponse.Raw,
    SeedTrace.CreateProblemResponse
> = core.serialization
    .union("type", {
        success: core.serialization.object({
            value: core.serialization.lazy(() => serializers.ProblemId),
        }),
        error: core.serialization.object({
            value: core.serialization.lazy(() => serializers.CreateProblemError),
        }),
    })
    .transform<SeedTrace.CreateProblemResponse>({
        transform: (value) => value,
        untransform: (value) => value,
    });

export declare namespace CreateProblemResponse {
    export type Raw = CreateProblemResponse.Success | CreateProblemResponse.Error;

    export interface Success {
        type: "success";
        value: serializers.ProblemId.Raw;
    }

    export interface Error {
        type: "error";
        value: serializers.CreateProblemError.Raw;
    }
}
