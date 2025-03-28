/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernDefinition from "../../../../api/index";
import * as core from "../../../../core";

export const OAuthRefreshTokenRequestPropertiesSchema: core.serialization.ObjectSchema<
    serializers.OAuthRefreshTokenRequestPropertiesSchema.Raw,
    FernDefinition.OAuthRefreshTokenRequestPropertiesSchema
> = core.serialization.object({
    "refresh-token": core.serialization.string(),
});

export declare namespace OAuthRefreshTokenRequestPropertiesSchema {
    export interface Raw {
        "refresh-token": string;
    }
}
