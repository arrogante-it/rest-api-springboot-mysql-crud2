package com.arroganteIT.taskManager.dto;

import lombok.Data;

@Data
public class TaskDTO {
    private Long id;
    private String title;
    private boolean is_completed;
}
