package com.manikanta.projects.lovable_backend.entity;

import com.manikanta.projects.lovable_backend.enums.ProjectMemberRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ProjectMember {
    ProjectMemberId id;
    Project project;
    ProjectMemberRole role;
    User InvitedBy;
    Instant InvitedAt;
}
