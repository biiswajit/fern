/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../index";
import * as SeedApi from "../../api/index";
import * as core from "../../core";
import { ScoredColumn } from "./ScoredColumn";

export const QueryResult: core.serialization.ObjectSchema<serializers.QueryResult.Raw, SeedApi.QueryResult> =
    core.serialization.object({
        matches: core.serialization.list(ScoredColumn).optional(),
        namespace: core.serialization.string().optional(),
    });

export declare namespace QueryResult {
    export interface Raw {
        matches?: ScoredColumn.Raw[] | null;
        namespace?: string | null;
    }
}
