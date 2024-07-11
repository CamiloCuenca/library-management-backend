package com.library.library_management.entity;


import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
@Embeddable
public class UsersRolesId implements Serializable {

    private Long userId;
    private Long roleId;

    //empty constructor
    public UsersRolesId() {}

    //constructor
    public UsersRolesId(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersRolesId that = (UsersRolesId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleId);
    }
}
