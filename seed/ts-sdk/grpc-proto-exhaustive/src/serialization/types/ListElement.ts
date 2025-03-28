/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../index";
import * as SeedApi from "../../api/index";
import * as core from "../../core";

export const ListElement: core.serialization.ObjectSchema<serializers.ListElement.Raw, SeedApi.ListElement> =
    core.serialization.object({
        id: core.serialization.string().optional(),
    });

export declare namespace ListElement {
    export interface Raw {
        id?: string | null;
    }
}
