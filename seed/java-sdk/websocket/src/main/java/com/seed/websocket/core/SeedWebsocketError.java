/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.websocket.core;

/**
 * This class serves as the base exception for all errors in the SDK.
 */
public class SeedWebsocketError extends RuntimeException {
    public SeedWebsocketError(String message) {
        super(message);
    }

    public SeedWebsocketError(String message, Exception e) {
        super(message, e);
    }
}