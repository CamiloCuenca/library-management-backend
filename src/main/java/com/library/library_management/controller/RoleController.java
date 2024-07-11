package com.library.library_management.controller;

import com.library.library_management.entity.Role;
import com.library.library_management.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "v1/Roles")
public class RoleController {
    @Autowired
    private final RoleService roleService;

    //Constructor
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    /** This method is the GET request that returns all roles
     *
     * @return All roles
     */
    @GetMapping
    public List<Role> getAll(){
        return roleService.getRoles();
    }

    /** This method is the GET request that return a specific user
     *
     * @param roleId
     * @return specific role
     */
    @GetMapping("/{roleId}")
    public Optional<Role> getById(@PathVariable("roleId") Long roleId){
        return roleService.getRole(roleId);
    }

    /** This method is the POST request that save or update a user
     *
     * @param role
     */
    @PostMapping
    public void saveUpdate(@RequestBody Role role){
        roleService.saveOrUpdate(role);
    }

    /** This method is DELETE request that delete the specific role
     *
     * @param roleId
     */
    @DeleteMapping("/{roleId}")
    public void saveUpdate(@PathVariable("roleId") Long roleId){
        roleService.delete(roleId);
    }


}
