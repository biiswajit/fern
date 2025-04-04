/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.api.model.ast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = T.Builder.class)
public final class T {
    private final TorU child;

    private T(TorU child) {
        this.child = child;
    }

    @JsonProperty("child")
    public TorU getChild() {
        return child;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof T && equalTo((T) other);
    }

    private boolean equalTo(T other) {
        return child.equals(other.child);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.child);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ChildStage builder() {
        return new Builder();
    }

    public interface ChildStage {
        _FinalStage child(TorU child);

        Builder from(T other);
    }

    public interface _FinalStage {
        T build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ChildStage, _FinalStage {
        private TorU child;

        private Builder() {}

        @java.lang.Override
        public Builder from(T other) {
            child(other.getChild());
            return this;
        }

        @java.lang.Override
        @JsonSetter("child")
        public _FinalStage child(TorU child) {
            this.child = Objects.requireNonNull(child, "child must not be null");
            return this;
        }

        @java.lang.Override
        public T build() {
            return new T(child);
        }
    }
}
