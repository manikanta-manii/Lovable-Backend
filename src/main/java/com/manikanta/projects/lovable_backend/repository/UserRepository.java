package com.manikanta.projects.lovable_backend.repository;

import com.manikanta.projects.lovable_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
