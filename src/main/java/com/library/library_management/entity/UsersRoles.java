package com.library.library_management.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users-roles")

public class UsersRoles {

    @EmbeddedId
    private UsersRolesId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "roleId")
    private Role role;
}
