package com.manikanta.projects.lovable_backend.mapper;

import com.manikanta.projects.lovable_backend.dto.project.ProjectResponse;
import com.manikanta.projects.lovable_backend.dto.project.ProjectSummaryResponse;
import com.manikanta.projects.lovable_backend.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(source = "name", target= "projectName")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projectList);
}
