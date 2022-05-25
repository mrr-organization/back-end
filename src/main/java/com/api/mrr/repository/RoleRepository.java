package com.api.mrr.repository;

import com.api.mrr.constant.ERole;
import com.api.mrr.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByRoleName(ERole name);
}
