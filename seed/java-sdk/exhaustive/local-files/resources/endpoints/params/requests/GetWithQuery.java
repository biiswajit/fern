/**
 * This file was auto-generated by Fern from our API Definition.
 */

package com.fern.sdk.resources.endpoints.params.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fern.sdk.core.ObjectMappers;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(
    builder = GetWithQuery.Builder.class
)
public final class GetWithQuery {
  private final String query;

  private final int number;

  private final Map<String, Object> additionalProperties;

  private GetWithQuery(String query, int number, Map<String, Object> additionalProperties) {
    this.query = query;
    this.number = number;
    this.additionalProperties = additionalProperties;
  }

  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  @JsonProperty("number")
  public int getNumber() {
    return number;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GetWithQuery && equalTo((GetWithQuery) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(GetWithQuery other) {
    return query.equals(other.query) && number == other.number;
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.query, this.number);
  }

  @java.lang.Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static QueryStage builder() {
    return new Builder();
  }

  public interface QueryStage {
    NumberStage query(@NotNull String query);

    Builder from(GetWithQuery other);
  }

  public interface NumberStage {
    _FinalStage number(int number);
  }

  public interface _FinalStage {
    GetWithQuery build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements QueryStage, NumberStage, _FinalStage {
    private String query;

    private int number;

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    @java.lang.Override
    public Builder from(GetWithQuery other) {
      query(other.getQuery());
      number(other.getNumber());
      return this;
    }

    @java.lang.Override
    @JsonSetter("query")
    public NumberStage query(@NotNull String query) {
      this.query = Objects.requireNonNull(query, "query must not be null");
      return this;
    }

    @java.lang.Override
    @JsonSetter("number")
    public _FinalStage number(int number) {
      this.number = number;
      return this;
    }

    @java.lang.Override
    public GetWithQuery build() {
      return new GetWithQuery(query, number, additionalProperties);
    }
  }
}
