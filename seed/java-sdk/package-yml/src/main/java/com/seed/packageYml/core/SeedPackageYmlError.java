/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.packageYml.core;

/**
 * This class serves as the base exception for all errors in the SDK.
 */
public class SeedPackageYmlError extends RuntimeException {
    public SeedPackageYmlError(String message) {
        super(message);
    }

    public SeedPackageYmlError(String message, Exception e) {
        super(message, e);
    }
}