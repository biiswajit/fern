/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.objectsWithImports;

import com.seed.objectsWithImports.core.ClientOptions;
import com.seed.objectsWithImports.core.Suppliers;
import com.seed.objectsWithImports.resources.optional.AsyncOptionalClient;
import java.util.function.Supplier;

public class AsyncSeedObjectsWithImportsClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<AsyncOptionalClient> optionalClient;

    public AsyncSeedObjectsWithImportsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.optionalClient = Suppliers.memoize(() -> new AsyncOptionalClient(clientOptions));
    }

    public AsyncOptionalClient optional() {
        return this.optionalClient.get();
    }

    public static AsyncSeedObjectsWithImportsClientBuilder builder() {
        return new AsyncSeedObjectsWithImportsClientBuilder();
    }
}
