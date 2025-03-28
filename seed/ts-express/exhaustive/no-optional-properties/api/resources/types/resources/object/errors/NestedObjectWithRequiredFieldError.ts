/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as errors from "../../../../../../errors/index";
import * as SeedExhaustive from "../../../../../index";
import express from "express";
import * as serializers from "../../../../../../serialization/index";

export class NestedObjectWithRequiredFieldError extends errors.SeedExhaustiveError {
    constructor(private readonly body: SeedExhaustive.types.NestedObjectWithRequiredField) {
        super("NestedObjectWithRequiredFieldError");
        Object.setPrototypeOf(this, NestedObjectWithRequiredFieldError.prototype);
    }

    public async send(res: express.Response): Promise<void> {
        res.status(400).json(
            serializers.types.NestedObjectWithRequiredField.jsonOrThrow(this.body, { unrecognizedObjectKeys: "strip" }),
        );
    }
}
