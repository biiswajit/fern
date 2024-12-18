/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../index";
import * as SeedObject from "../../api/index";
import * as core from "../../core";

export const InlineType2: core.serialization.ObjectSchema<serializers.InlineType2.Raw, SeedObject.InlineType2> =
    core.serialization.object({
        baz: core.serialization.string(),
    });

export declare namespace InlineType2 {
    interface Raw {
        baz: string;
    }
}
