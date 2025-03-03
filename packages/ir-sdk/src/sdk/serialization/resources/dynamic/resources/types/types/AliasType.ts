/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../../../index";
import * as FernIr from "../../../../../../api/index";
import * as core from "../../../../../../core";
import { Declaration } from "../../declaration/types/Declaration";

export const AliasType: core.serialization.ObjectSchema<serializers.dynamic.AliasType.Raw, FernIr.dynamic.AliasType> =
    core.serialization.objectWithoutOptionalProperties({
        declaration: Declaration,
        typeReference: core.serialization.lazy(() => serializers.dynamic.TypeReference),
    });

export declare namespace AliasType {
    export interface Raw {
        declaration: Declaration.Raw;
        typeReference: serializers.dynamic.TypeReference.Raw;
    }
}
