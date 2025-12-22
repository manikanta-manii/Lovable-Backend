package com.manikanta.projects.lovable_backend.service;

import com.manikanta.projects.lovable_backend.dto.project.FileContentResponse;
import com.manikanta.projects.lovable_backend.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);
    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
