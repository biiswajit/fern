/**
 * This file was auto-generated by Fern from our API Definition.
 */

package com.fern.sdk.resources.types.union.errors;

import com.fern.sdk.core.SeedExhaustiveApiError;
import com.fern.sdk.resources.types.union.types.Animal;
import java.lang.Override;

public final class SeedExhaustiveErrorWithUnionBody extends SeedExhaustiveApiError {
  /**
   * The body of the response that triggered the exception.
   */
  private final Animal body;

  public SeedExhaustiveErrorWithUnionBody(Animal body) {
    super("ErrorWithUnionBody", 400, body);
    this.body = body;
  }

  /**
   * @return the body
   */
  @Override
  public Animal body() {
    return this.body;
  }
}