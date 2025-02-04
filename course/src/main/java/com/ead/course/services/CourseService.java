package com.ead.course.services;

import com.ead.course.dtos.CourseRecordDto;
import com.ead.course.models.CourseModel;
import com.ead.course.models.ModuleModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CourseService {
    void delete(CourseModel courseModel);
    CourseModel save(CourseRecordDto courseRecordDto);
    boolean existsByName(@NotBlank String name);
    List<CourseModel> findAll();
    Optional<CourseModel> findById(UUID courseId);
    CourseModel update(CourseRecordDto courseRecordDto, CourseModel courseModel);
}
