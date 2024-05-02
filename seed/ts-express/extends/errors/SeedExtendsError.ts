/**
 * This file was auto-generated by Fern from our API Definition.
 */

import express from "express";

export abstract class SeedExtendsError extends Error {
    constructor(public readonly errorName?: string) {
        super();
        Object.setPrototypeOf(this, SeedExtendsError.prototype);
    }

    public abstract send(res: express.Response): Promise<void>;
}