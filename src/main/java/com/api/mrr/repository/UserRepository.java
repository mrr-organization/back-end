package com.api.mrr.repository;

import com.api.mrr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserEmail(String email);
    Boolean existsByUserPhone(String phone);
    Boolean existsByUserEmail(String email);
}
