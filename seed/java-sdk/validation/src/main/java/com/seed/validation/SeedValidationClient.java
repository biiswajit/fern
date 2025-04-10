/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.validation;

import com.seed.validation.core.ClientOptions;
import com.seed.validation.core.RequestOptions;
import com.seed.validation.requests.CreateRequest;
import com.seed.validation.requests.GetRequest;
import com.seed.validation.types.Type;

public class SeedValidationClient {
    protected final ClientOptions clientOptions;

    private final RawSeedValidationClient rawClient;

    public SeedValidationClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawSeedValidationClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawSeedValidationClient withRawResponse() {
        return this.rawClient;
    }

    public Type create(CreateRequest request) {
        return this.rawClient.create(request).body();
    }

    public Type create(CreateRequest request, RequestOptions requestOptions) {
        return this.rawClient.create(request, requestOptions).body();
    }

    public Type get(GetRequest request) {
        return this.rawClient.get(request).body();
    }

    public Type get(GetRequest request, RequestOptions requestOptions) {
        return this.rawClient.get(request, requestOptions).body();
    }

    public static SeedValidationClientBuilder builder() {
        return new SeedValidationClientBuilder();
    }
}
