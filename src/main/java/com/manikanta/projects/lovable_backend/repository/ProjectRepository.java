package com.manikanta.projects.lovable_backend.repository;

import com.manikanta.projects.lovable_backend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("""
            SELECT p from Project p
            WHERE p.owner.id = :userId AND p.deletedAt Is NULL
            ORDER BY p.updatedAt Desc
            """)
    List<Project> findAllAccessibleByUser(@Param("userId") Long userId);
}
