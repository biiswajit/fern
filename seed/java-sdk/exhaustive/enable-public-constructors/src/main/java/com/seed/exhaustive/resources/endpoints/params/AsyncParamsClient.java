/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.exhaustive.resources.endpoints.params;

import com.seed.exhaustive.core.ClientOptions;
import com.seed.exhaustive.core.RequestOptions;
import com.seed.exhaustive.resources.endpoints.params.requests.GetWithInlinePath;
import com.seed.exhaustive.resources.endpoints.params.requests.GetWithInlinePathAndQuery;
import com.seed.exhaustive.resources.endpoints.params.requests.GetWithMultipleQuery;
import com.seed.exhaustive.resources.endpoints.params.requests.GetWithPathAndQuery;
import com.seed.exhaustive.resources.endpoints.params.requests.GetWithQuery;
import com.seed.exhaustive.resources.endpoints.params.requests.ModifyResourceAtInlinedPath;
import java.util.concurrent.CompletableFuture;

public class AsyncParamsClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawParamsClient rawClient;

    public AsyncParamsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawParamsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawParamsClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * GET with path param
     */
    public CompletableFuture<String> getWithPath(String param) {
        return this.rawClient.getWithPath(param).thenApply(response -> response.body());
    }

    /**
     * GET with path param
     */
    public CompletableFuture<String> getWithPath(String param, RequestOptions requestOptions) {
        return this.rawClient.getWithPath(param, requestOptions).thenApply(response -> response.body());
    }

    /**
     * GET with path param
     */
    public CompletableFuture<String> getWithInlinePath(GetWithInlinePath request) {
        return this.rawClient.getWithInlinePath(request).thenApply(response -> response.body());
    }

    /**
     * GET with path param
     */
    public CompletableFuture<String> getWithInlinePath(GetWithInlinePath request, RequestOptions requestOptions) {
        return this.rawClient.getWithInlinePath(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * GET with query param
     */
    public CompletableFuture<Void> getWithQuery(GetWithQuery request) {
        return this.rawClient.getWithQuery(request).thenApply(response -> response.body());
    }

    /**
     * GET with query param
     */
    public CompletableFuture<Void> getWithQuery(GetWithQuery request, RequestOptions requestOptions) {
        return this.rawClient.getWithQuery(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * GET with multiple of same query param
     */
    public CompletableFuture<Void> getWithAllowMultipleQuery(GetWithMultipleQuery request) {
        return this.rawClient.getWithAllowMultipleQuery(request).thenApply(response -> response.body());
    }

    /**
     * GET with multiple of same query param
     */
    public CompletableFuture<Void> getWithAllowMultipleQuery(
            GetWithMultipleQuery request, RequestOptions requestOptions) {
        return this.rawClient.getWithAllowMultipleQuery(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * GET with path and query params
     */
    public CompletableFuture<Void> getWithPathAndQuery(String param, GetWithPathAndQuery request) {
        return this.rawClient.getWithPathAndQuery(param, request).thenApply(response -> response.body());
    }

    /**
     * GET with path and query params
     */
    public CompletableFuture<Void> getWithPathAndQuery(
            String param, GetWithPathAndQuery request, RequestOptions requestOptions) {
        return this.rawClient
                .getWithPathAndQuery(param, request, requestOptions)
                .thenApply(response -> response.body());
    }

    /**
     * GET with path and query params
     */
    public CompletableFuture<Void> getWithInlinePathAndQuery(GetWithInlinePathAndQuery request) {
        return this.rawClient.getWithInlinePathAndQuery(request).thenApply(response -> response.body());
    }

    /**
     * GET with path and query params
     */
    public CompletableFuture<Void> getWithInlinePathAndQuery(
            GetWithInlinePathAndQuery request, RequestOptions requestOptions) {
        return this.rawClient.getWithInlinePathAndQuery(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * PUT to update with path param
     */
    public CompletableFuture<String> modifyWithPath(String param, String request) {
        return this.rawClient.modifyWithPath(param, request).thenApply(response -> response.body());
    }

    /**
     * PUT to update with path param
     */
    public CompletableFuture<String> modifyWithPath(String param, String request, RequestOptions requestOptions) {
        return this.rawClient.modifyWithPath(param, request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * PUT to update with path param
     */
    public CompletableFuture<String> modifyWithInlinePath(ModifyResourceAtInlinedPath request) {
        return this.rawClient.modifyWithInlinePath(request).thenApply(response -> response.body());
    }

    /**
     * PUT to update with path param
     */
    public CompletableFuture<String> modifyWithInlinePath(
            ModifyResourceAtInlinedPath request, RequestOptions requestOptions) {
        return this.rawClient.modifyWithInlinePath(request, requestOptions).thenApply(response -> response.body());
    }
}
