/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedTrace from "../../../../api/index";
import * as core from "../../../../core";

export const SinglyLinkedListValue: core.serialization.ObjectSchema<
    serializers.SinglyLinkedListValue.Raw,
    SeedTrace.SinglyLinkedListValue
> = core.serialization.object({
    head: core.serialization.lazy(() => serializers.NodeId).optional(),
    nodes: core.serialization.record(
        core.serialization.lazy(() => serializers.NodeId),
        core.serialization.lazyObject(() => serializers.SinglyLinkedListNodeValue),
    ),
});

export declare namespace SinglyLinkedListValue {
    export interface Raw {
        head?: serializers.NodeId.Raw | null;
        nodes: Record<serializers.NodeId.Raw, serializers.SinglyLinkedListNodeValue.Raw>;
    }
}
