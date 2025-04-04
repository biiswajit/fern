/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as core from "./core";
import { Userservice } from "./api/resources/userservice/client/Client";

export declare namespace SeedApiClient {
    export interface Options {
        environment: core.Supplier<string>;
        /** Specify a custom URL to connect the client to. */
        baseUrl?: core.Supplier<string>;
    }

    export interface RequestOptions {
        /** The maximum time to wait for a response in seconds. */
        timeoutInSeconds?: number;
        /** The number of times to retry the request. Defaults to 2. */
        maxRetries?: number;
        /** A hook to abort the request. */
        abortSignal?: AbortSignal;
        /** Additional headers to include in the request. */
        headers?: Record<string, string>;
    }
}

export class SeedApiClient {
    protected _userservice: Userservice | undefined;

    constructor(protected readonly _options: SeedApiClient.Options) {}

    public get userservice(): Userservice {
        return (this._userservice ??= new Userservice(this._options));
    }
}
