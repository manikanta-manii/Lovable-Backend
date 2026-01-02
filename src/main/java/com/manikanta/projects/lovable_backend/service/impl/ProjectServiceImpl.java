package com.manikanta.projects.lovable_backend.service.impl;

import com.manikanta.projects.lovable_backend.dto.project.ProjectRequest;
import com.manikanta.projects.lovable_backend.dto.project.ProjectResponse;
import com.manikanta.projects.lovable_backend.dto.project.ProjectSummaryResponse;
import com.manikanta.projects.lovable_backend.entity.Project;
import com.manikanta.projects.lovable_backend.entity.User;
import com.manikanta.projects.lovable_backend.mapper.ProjectMapper;
import com.manikanta.projects.lovable_backend.repository.ProjectRepository;
import com.manikanta.projects.lovable_backend.repository.UserRepository;
import com.manikanta.projects.lovable_backend.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();
        Project project = Project.builder().name(request.name()).owner(owner).isPublic(false).build(); // why its not default ?
        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        List<Project> projects = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long projectId) {
        // find what s the use case of the userid ? user1 user2/1
        // maybe this should be custom ? becuase if we try to get the peoject with the deleted id this should not work!
        Project project = projectRepository.findById(projectId).orElseThrow();
        if(project.getDeletedAt() != null){
            // for now i don't know how to handle this , custom exception , because the return type has to be the project response
//            return new Exception("Project Not found");
        }
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        // while finding the userid check if he has access to it based on the useId?? i will deal with this in the security class!
        // maybe this should be custom ? becuase if we try to get the peoject with the deleted id this should not work!
        Project project = projectRepository.findById(id).orElseThrow();
        project.setName(request.name());
        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public void softDeleteProject(Long id, Long userId) {
        // while finding the userid check if he has access to it based on the useId?? i will deal with this in the security class!
        Project project = projectRepository.findById(id).orElseThrow();
        project.setDeletedAt(Instant.now());
        project = projectRepository.save(project);
    }
}
