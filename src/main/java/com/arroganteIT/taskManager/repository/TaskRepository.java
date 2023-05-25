package com.arroganteIT.taskManager.repository;

import com.arroganteIT.taskManager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
