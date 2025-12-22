package com.manikanta.projects.lovable_backend.service;

import com.manikanta.projects.lovable_backend.dto.project.ProjectRequest;
import com.manikanta.projects.lovable_backend.dto.project.ProjectResponse;
import com.manikanta.projects.lovable_backend.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);
    ProjectResponse getUserProjectsById(Long projectId,Long userId);
    ProjectSummaryResponse createProject(ProjectRequest request,Long userId);
    ProjectResponse updateProject(Long id, ProjectRequest request, long l);
    void softDeleteProject(Long id, Long userId);
}
