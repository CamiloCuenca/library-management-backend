package com.library.library_management.repository;

import com.library.library_management.entity.UsersRoles;
import com.library.library_management.entity.UsersRolesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRolesRepository extends JpaRepository<UsersRoles, UsersRolesId> {
}
