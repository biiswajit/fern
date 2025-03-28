/**
 * This file was auto-generated by Fern from our API Definition.
 */

package types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import core.ObjectMappers;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(
    builder = ObjectTypeWithSetAliasType.Builder.class
)
public final class ObjectTypeWithSetAliasType {
  private final Set<AliasProperty> prop;

  private ObjectTypeWithSetAliasType(Set<AliasProperty> prop) {
    this.prop = prop;
  }

  @JsonProperty("prop")
  public Set<AliasProperty> getProp() {
    return prop;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ObjectTypeWithSetAliasType && equalTo((ObjectTypeWithSetAliasType) other);
  }

  private boolean equalTo(ObjectTypeWithSetAliasType other) {
    return prop.equals(other.prop);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.prop);
  }

  @java.lang.Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Set<AliasProperty> prop = new LinkedHashSet<>();

    private Builder() {
    }

    public Builder from(ObjectTypeWithSetAliasType other) {
      prop(other.getProp());
      return this;
    }

    @JsonSetter(
        value = "prop",
        nulls = Nulls.SKIP
    )
    public Builder prop(Set<AliasProperty> prop) {
      this.prop.clear();
      this.prop.addAll(prop);
      return this;
    }

    public Builder addProp(AliasProperty prop) {
      this.prop.add(prop);
      return this;
    }

    public Builder addAllProp(Set<AliasProperty> prop) {
      this.prop.addAll(prop);
      return this;
    }

    public ObjectTypeWithSetAliasType build() {
      return new ObjectTypeWithSetAliasType(prop);
    }
  }
}
