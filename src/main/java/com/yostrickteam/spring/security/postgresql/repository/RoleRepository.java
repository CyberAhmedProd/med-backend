package com.yostrickteam.spring.security.postgresql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yostrickteam.spring.security.postgresql.models.ERole;
import com.yostrickteam.spring.security.postgresql.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
