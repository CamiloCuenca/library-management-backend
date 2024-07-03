package com.library.library_management.service;

import com.library.library_management.entity.Role;
import com.library.library_management.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getRoles(){
        return roleRepository.findAll();
    }

    public Optional<Role> getRole(Long id){
        return roleRepository.findById(id);
    }

    public void saveOrUpdate(Role role){
        roleRepository.save(role);
    }

    public void delete(Long id){
        roleRepository.deleteById(id);
    }

}
