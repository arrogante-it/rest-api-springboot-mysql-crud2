package com.arroganteIT.taskManager.controller;

import com.arroganteIT.taskManager.dto.TaskDTO;
import com.arroganteIT.taskManager.entity.Task;
import com.arroganteIT.taskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody TaskDTO taskDto) {
        Task task = taskService.createTask(taskDto.getTitle(), taskDto.is_completed());
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@RequestBody TaskDTO taskDto, @PathVariable("id") Long taskId) {
        Task task = taskService.updateTask(taskDto.getId(), taskDto.getTitle(), taskDto.is_completed());
        return ResponseEntity.ok(task);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable("id") Long id) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable("id") Long id) {
        taskService.deleteTaskById(id);
    }
}











































