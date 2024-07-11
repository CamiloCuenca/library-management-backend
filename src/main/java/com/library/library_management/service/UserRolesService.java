package com.library.library_management.service;

import com.library.library_management.entity.User;
import com.library.library_management.entity.UsersRoles;
import com.library.library_management.entity.UsersRolesId;
import com.library.library_management.repository.UserRepository;
import com.library.library_management.repository.UsersRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRolesService {
    @Autowired
    private UsersRolesRepository usersRolesRepository;

    /** this method returns all user roles
     *
     * @return All user roles
     */
    public List<UsersRoles> findAll() {
        return usersRolesRepository.findAll();
    }

    /** This method return a specific user roles
     *
     * @param id
     * @return specific user roles
     */
    public Optional<UsersRoles> findById(UsersRolesId id) {
        return usersRolesRepository.findById(id);
    }

    /** this method save or update a users roles
     *
     * @param usersRoles
     * @return
     */
    public UsersRoles save(UsersRoles usersRoles) {
        return usersRolesRepository.save(usersRoles);
    }

    /** this method delete a specific user role
     *
     * @param id
     */
    public void deleteById(UsersRolesId id) {
        usersRolesRepository.deleteById(id);
    }
}
