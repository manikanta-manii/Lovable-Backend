package com.manikanta.projects.lovable_backend.dto.member;

import com.manikanta.projects.lovable_backend.enums.ProjectMemberRole;

public record UpdateMemberRoleRequest(
        ProjectMemberRole role
) {
}
