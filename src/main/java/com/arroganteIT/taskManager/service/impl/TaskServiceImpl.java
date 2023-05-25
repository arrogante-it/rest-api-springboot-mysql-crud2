package com.arroganteIT.taskManager.service.impl;

import com.arroganteIT.taskManager.entity.Task;
import com.arroganteIT.taskManager.repository.TaskRepository;
import com.arroganteIT.taskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(String title, boolean isCompleted) {
        Task task = settingTasks(title, isCompleted);
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, String title, boolean isCompleted) {
        Task task = settingTasks(title, isCompleted);
        task.setId(id);
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }

    private Task settingTasks(String title, boolean isCompleted) {
        Task task = new Task();
        task.set_completed(isCompleted);
        task.setTitle(title);
        task.setCreationDate(LocalDate.now());
        return task;
    }
}
