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

    /** this method returns all roles
     *
     * @return All roles
     */
    public List<Role> getRoles(){
        return roleRepository.findAll();
    }

    /** this method return a specific role
     *
     * @param id
     * @return specific role
     */
    public Optional<Role> getRole(Long id){
        return roleRepository.findById(id);
    }

    /** this method savo or update a role
     *
     * @param role
     */
    public void saveOrUpdate(Role role){
        roleRepository.save(role);
    }

    /** this method delete a specific role
     *
     * @param id
     */
    public void delete(Long id){
        roleRepository.deleteById(id);
    }

}
