package com.practice.api.resources;

import java.util.UUID;

import com.practice.api.resources.base.ApiResource;

import io.crnk.core.resource.annotations.JsonApiField;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiRelationId;
import io.crnk.core.resource.annotations.JsonApiResource;

import static com.practice.api.resources.MentorResource.RESOURCE_PATH;
import static com.practice.api.resources.MentorResource.RESOURCE_TYPE;

/**
 * @author nrmaridu
 * @since May 08, 2020
 */
@JsonApiResource(type = RESOURCE_TYPE, resourcePath = RESOURCE_PATH)
public class MentorResource extends ApiResource {

    public static final String RESOURCE_TYPE = "mentor";
    public static final String RESOURCE_PATH = "mentors";

    @JsonApiId
    private UUID id;

    @JsonApiField
    private String name;

    @JsonApiRelationId
    private UUID departmentId;

    @JsonApiRelation
    private DepartmentResource department;

    public MentorResource() {
    }

    public MentorResource(UUID id, String name, UUID departmentId) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }

    public DepartmentResource getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentResource department) {
        this.department = department;
    }
}
