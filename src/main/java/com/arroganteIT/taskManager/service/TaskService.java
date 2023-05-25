package com.arroganteIT.taskManager.service;

import com.arroganteIT.taskManager.entity.Task;

public interface TaskService {
    Task createTask(String title, boolean isCompleted);

    Task updateTask(Long id, String title, boolean isCompleted);


    Task getTaskById(Long id);

    void deleteTaskById(Long id);
}
