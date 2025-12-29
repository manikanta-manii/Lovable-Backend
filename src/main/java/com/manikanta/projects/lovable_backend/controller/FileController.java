package com.manikanta.projects.lovable_backend.controller;

import com.manikanta.projects.lovable_backend.dto.project.FileNode;
import com.manikanta.projects.lovable_backend.dto.project.FileContentResponse;
import com.manikanta.projects.lovable_backend.service.FileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class FileController {
    FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId) {
        return ResponseEntity.ok(fileService.getFileTree(projectId,1L));
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFile(@PathVariable Long projectId, @PathVariable String path) {

        return ResponseEntity.ok(fileService.getFileContent(projectId, path, 1L));
    }
}
