package com.hoaxify.ws.user.persistence.repository;

import com.hoaxify.ws.user.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
