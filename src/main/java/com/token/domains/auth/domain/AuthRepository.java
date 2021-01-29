package com.token.domains.auth.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthRepository extends JpaRepository<AuthEntity, Long> {

  Optional<AuthEntity> findByUsersEntityId(Long userId);
}
