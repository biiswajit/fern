/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../..";
import * as FernIr from "../../../../api";
import * as core from "../../../../core";

export const SseStreamChunk: core.serialization.ObjectSchema<serializers.SseStreamChunk.Raw, FernIr.SseStreamChunk> =
    core.serialization
        .objectWithoutOptionalProperties({
            payload: core.serialization.lazy(async () => (await import("../../..")).TypeReference),
            terminator: core.serialization.string().optional(),
        })
        .extend(core.serialization.lazyObject(async () => (await import("../../..")).WithDocs));

export declare namespace SseStreamChunk {
    interface Raw extends serializers.WithDocs.Raw {
        payload: serializers.TypeReference.Raw;
        terminator?: string | null;
    }
}