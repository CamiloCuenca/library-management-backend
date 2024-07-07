package com.library.library_management.controller;

import com.library.library_management.entity.UsersRoles;
import com.library.library_management.entity.UsersRolesId;
import com.library.library_management.service.UserRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ( path = "v1/UsersRoles")
public class UsersRolesController {
    @Autowired
    private UserRolesService usersRolesService;

    @GetMapping
    public List<UsersRoles> getAllUsersRoles() {
        return usersRolesService.findAll();
    }

    @GetMapping("/{userId}/{roleId}")
    public ResponseEntity<UsersRoles> getUsersRolesById(@PathVariable Long userId, @PathVariable Long roleId) {
        UsersRolesId id = new UsersRolesId(userId, roleId);
        Optional<UsersRoles> usersRoles = usersRolesService.findById(id);
        return usersRoles.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public UsersRoles createUsersRoles(@RequestBody UsersRoles usersRoles) {
        return usersRolesService.save(usersRoles);
    }

    @DeleteMapping("/{userId}/{roleId}")
    public ResponseEntity<Void> deleteUsersRoles(@PathVariable Long userId, @PathVariable Long roleId) {
        UsersRolesId id = new UsersRolesId(userId, roleId);
        usersRolesService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
