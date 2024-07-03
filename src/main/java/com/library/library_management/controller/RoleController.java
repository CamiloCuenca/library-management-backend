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

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> getAll(){
        return roleService.getRoles();
    }

    @GetMapping("/{roleId}")
    public Optional<Role> getById(@PathVariable("roleId") Long roleId){
        return roleService.getRole(roleId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Role role){
        roleService.saveOrUpdate(role);
    }

    @DeleteMapping("/{roleId}")
    public void saveUpdate(@PathVariable("roleId") Long roleId){
        roleService.delete(roleId);
    }


}
