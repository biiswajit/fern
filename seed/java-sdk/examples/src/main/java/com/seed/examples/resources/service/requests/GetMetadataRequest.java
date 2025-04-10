/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.examples.resources.service.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.examples.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GetMetadataRequest.Builder.class)
public final class GetMetadataRequest {
    private final String xApiVersion;

    private final Optional<Boolean> shallow;

    private final Optional<String> tag;

    private final Map<String, Object> additionalProperties;

    private GetMetadataRequest(
            String xApiVersion,
            Optional<Boolean> shallow,
            Optional<String> tag,
            Map<String, Object> additionalProperties) {
        this.xApiVersion = xApiVersion;
        this.shallow = shallow;
        this.tag = tag;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("X-API-Version")
    public String getXApiVersion() {
        return xApiVersion;
    }

    @JsonProperty("shallow")
    public Optional<Boolean> getShallow() {
        return shallow;
    }

    @JsonProperty("tag")
    public Optional<String> getTag() {
        return tag;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetMetadataRequest && equalTo((GetMetadataRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetMetadataRequest other) {
        return xApiVersion.equals(other.xApiVersion) && shallow.equals(other.shallow) && tag.equals(other.tag);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.xApiVersion, this.shallow, this.tag);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static XApiVersionStage builder() {
        return new Builder();
    }

    public interface XApiVersionStage {
        _FinalStage xApiVersion(@NotNull String xApiVersion);

        Builder from(GetMetadataRequest other);
    }

    public interface _FinalStage {
        GetMetadataRequest build();

        _FinalStage shallow(Optional<Boolean> shallow);

        _FinalStage shallow(Boolean shallow);

        _FinalStage tag(Optional<String> tag);

        _FinalStage tag(String tag);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements XApiVersionStage, _FinalStage {
        private String xApiVersion;

        private Optional<String> tag = Optional.empty();

        private Optional<Boolean> shallow = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GetMetadataRequest other) {
            xApiVersion(other.getXApiVersion());
            shallow(other.getShallow());
            tag(other.getTag());
            return this;
        }

        @java.lang.Override
        @JsonSetter("X-API-Version")
        public _FinalStage xApiVersion(@NotNull String xApiVersion) {
            this.xApiVersion = Objects.requireNonNull(xApiVersion, "xApiVersion must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage tag(String tag) {
            this.tag = Optional.ofNullable(tag);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "tag", nulls = Nulls.SKIP)
        public _FinalStage tag(Optional<String> tag) {
            this.tag = tag;
            return this;
        }

        @java.lang.Override
        public _FinalStage shallow(Boolean shallow) {
            this.shallow = Optional.ofNullable(shallow);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "shallow", nulls = Nulls.SKIP)
        public _FinalStage shallow(Optional<Boolean> shallow) {
            this.shallow = shallow;
            return this;
        }

        @java.lang.Override
        public GetMetadataRequest build() {
            return new GetMetadataRequest(xApiVersion, shallow, tag, additionalProperties);
        }
    }
}
