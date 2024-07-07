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

    public List<UsersRoles> findAll() {
        return usersRolesRepository.findAll();
    }

    public Optional<UsersRoles> findById(UsersRolesId id) {
        return usersRolesRepository.findById(id);
    }

    public UsersRoles save(UsersRoles usersRoles) {
        return usersRolesRepository.save(usersRoles);
    }

    public void deleteById(UsersRolesId id) {
        usersRolesRepository.deleteById(id);
    }
}
