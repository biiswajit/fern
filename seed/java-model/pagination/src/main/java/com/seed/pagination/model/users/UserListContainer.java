/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.pagination.model.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.pagination.core.ObjectMappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = UserListContainer.Builder.class)
public final class UserListContainer {
    private final List<User> users;

    private UserListContainer(List<User> users) {
        this.users = users;
    }

    @JsonProperty("users")
    public List<User> getUsers() {
        return users;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserListContainer && equalTo((UserListContainer) other);
    }

    private boolean equalTo(UserListContainer other) {
        return users.equals(other.users);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.users);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<User> users = new ArrayList<>();

        private Builder() {}

        public Builder from(UserListContainer other) {
            users(other.getUsers());
            return this;
        }

        @JsonSetter(value = "users", nulls = Nulls.SKIP)
        public Builder users(List<User> users) {
            this.users.clear();
            this.users.addAll(users);
            return this;
        }

        public Builder addUsers(User users) {
            this.users.add(users);
            return this;
        }

        public Builder addAllUsers(List<User> users) {
            this.users.addAll(users);
            return this;
        }

        public UserListContainer build() {
            return new UserListContainer(users);
        }
    }
}
