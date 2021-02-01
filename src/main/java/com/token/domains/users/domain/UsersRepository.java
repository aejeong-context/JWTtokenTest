package com.token.domains.users.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersEntity,Long> {
    Optional<UsersEntity> findByUserId(String userId);
}
