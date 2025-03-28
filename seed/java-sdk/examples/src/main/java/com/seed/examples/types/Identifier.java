/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.examples.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.examples.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Identifier.Builder.class)
public final class Identifier {
    private final Type type;

    private final String value;

    private final String label;

    private final Map<String, Object> additionalProperties;

    private Identifier(Type type, String value, String label, Map<String, Object> additionalProperties) {
        this.type = type;
        this.value = value;
        this.label = label;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Identifier && equalTo((Identifier) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Identifier other) {
        return type.equals(other.type) && value.equals(other.value) && label.equals(other.label);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.value, this.label);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        ValueStage type(@NotNull Type type);

        Builder from(Identifier other);
    }

    public interface ValueStage {
        LabelStage value(@NotNull String value);
    }

    public interface LabelStage {
        _FinalStage label(@NotNull String label);
    }

    public interface _FinalStage {
        Identifier build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, ValueStage, LabelStage, _FinalStage {
        private Type type;

        private String value;

        private String label;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Identifier other) {
            type(other.getType());
            value(other.getValue());
            label(other.getLabel());
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public ValueStage type(@NotNull Type type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("value")
        public LabelStage value(@NotNull String value) {
            this.value = Objects.requireNonNull(value, "value must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("label")
        public _FinalStage label(@NotNull String label) {
            this.label = Objects.requireNonNull(label, "label must not be null");
            return this;
        }

        @java.lang.Override
        public Identifier build() {
            return new Identifier(type, value, label, additionalProperties);
        }
    }
}
