package com.estoque.authuser.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.estoque.authuser.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID>, JpaSpecificationExecutor<UserModel> {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    boolean existsByRegistrationNumber(String registrationNumber);
}
