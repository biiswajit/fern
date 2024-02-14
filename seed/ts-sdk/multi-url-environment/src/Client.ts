/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as environments from "./environments";
import * as core from "./core";
import { Ec2 } from "./api/resources/ec2/client/Client";
import { S3 } from "./api/resources/s3/client/Client";

export declare namespace SeedMultiUrlEnvironmentClient {
    interface Options {
        environment?: core.Supplier<
            environments.SeedMultiUrlEnvironmentEnvironment | environments.SeedMultiUrlEnvironmentEnvironmentUrls
        >;
        token: core.Supplier<core.BearerToken>;
    }

    interface RequestOptions {
        timeoutInSeconds?: number;
        maxRetries?: number;
    }
}

export class SeedMultiUrlEnvironmentClient {
    constructor(protected readonly _options: SeedMultiUrlEnvironmentClient.Options) {}

    protected _ec2: Ec2 | undefined;

    public get ec2(): Ec2 {
        return (this._ec2 ??= new Ec2(this._options));
    }

    protected _s3: S3 | undefined;

    public get s3(): S3 {
        return (this._s3 ??= new S3(this._options));
    }
}