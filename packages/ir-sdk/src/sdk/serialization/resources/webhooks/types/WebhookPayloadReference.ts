/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernIr from "../../../../api/index";
import * as core from "../../../../core";
import { WithDocs } from "../../commons/types/WithDocs";

export const WebhookPayloadReference: core.serialization.ObjectSchema<
    serializers.WebhookPayloadReference.Raw,
    FernIr.WebhookPayloadReference
> = core.serialization
    .objectWithoutOptionalProperties({
        payloadType: core.serialization.lazy(() => serializers.TypeReference),
    })
    .extend(WithDocs);

export declare namespace WebhookPayloadReference {
    export interface Raw extends WithDocs.Raw {
        payloadType: serializers.TypeReference.Raw;
    }
}
