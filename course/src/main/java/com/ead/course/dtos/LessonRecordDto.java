package com.ead.course.dtos;

import jakarta.validation.constraints.NotBlank;

public record LessonRecordDto(@NotBlank(message = "Title is mandatory")
                              String title,

                              @NotBlank(message = "Description is mandatory")
                              String description,

                              @NotBlank(message = "Video url is mandatory")
                              String videoUrl){
}
