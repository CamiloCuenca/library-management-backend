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
    private final UserRolesService usersRolesService;

    //Constructor
    public UsersRolesController(UserRolesService usersRolesService) {
        this.usersRolesService = usersRolesService;
    }

    /** This method is the GET request that returns all Users Roles
     *
     * @return all users roles
     */
    @GetMapping
    public List<UsersRoles> getAllUsersRoles() {
        return usersRolesService.findAll();
    }

    /**
     * Handles GET requests to retrieve a specific UsersRoles entity based on user ID and role ID.
     *
     * @param userId the ID of the user
     * @param roleId the ID of the role
     * @return ResponseEntity containing the UsersRoles entity if found, or a 404 Not Found response if not
     */
    @GetMapping("/{userId}/{roleId}")
    public ResponseEntity<UsersRoles> getUsersRolesById(@PathVariable Long userId, @PathVariable Long roleId) {
        UsersRolesId id = new UsersRolesId(userId, roleId);
        Optional<UsersRoles> usersRoles = usersRolesService.findById(id);
        return usersRoles.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Handles POST requests to create a new UsersRoles entity.
     *
     * @param usersRoles the UsersRoles entity to be created
     * @return the created UsersRoles entity
     */
    @PostMapping
    public UsersRoles createUsersRoles(@RequestBody UsersRoles usersRoles) {
        return usersRolesService.save(usersRoles);
    }

    /**
     * Handles DELETE requests to remove a specific UsersRoles entity based on user ID and role ID.
     *
     * @param userId the ID of the user
     * @param roleId the ID of the role
     * @return ResponseEntity with no content to indicate successful deletion
     */
    @DeleteMapping("/{userId}/{roleId}")
    public ResponseEntity<Void> deleteUsersRoles(@PathVariable Long userId, @PathVariable Long roleId) {
        UsersRolesId id = new UsersRolesId(userId, roleId);
        usersRolesService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
