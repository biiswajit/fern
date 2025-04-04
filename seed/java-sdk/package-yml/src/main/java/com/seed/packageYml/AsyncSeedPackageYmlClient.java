/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.packageYml;

import com.seed.packageYml.core.ClientOptions;
import com.seed.packageYml.core.RequestOptions;
import com.seed.packageYml.core.Suppliers;
import com.seed.packageYml.resources.service.AsyncServiceClient;
import com.seed.packageYml.types.EchoRequest;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class AsyncSeedPackageYmlClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawSeedPackageYmlClient rawClient;

    protected final Supplier<AsyncServiceClient> serviceClient;

    public AsyncSeedPackageYmlClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawSeedPackageYmlClient(clientOptions);
        this.serviceClient = Suppliers.memoize(() -> new AsyncServiceClient(clientOptions));
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawSeedPackageYmlClient withRawResponse() {
        return this.rawClient;
    }

    public CompletableFuture<String> echo(EchoRequest request) {
        return this.rawClient.echo(request).thenApply(response -> response.body());
    }

    public CompletableFuture<String> echo(EchoRequest request, RequestOptions requestOptions) {
        return this.rawClient.echo(request, requestOptions).thenApply(response -> response.body());
    }

    public AsyncServiceClient service() {
        return this.serviceClient.get();
    }

    public static AsyncSeedPackageYmlClientBuilder builder() {
        return new AsyncSeedPackageYmlClientBuilder();
    }
}
