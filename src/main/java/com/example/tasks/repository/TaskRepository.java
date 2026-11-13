package com.example.tasks.repository;

import com.example.tasks.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

// Free CRUD: findAll, findById, save, deleteById ...
public interface TaskRepository extends JpaRepository<Task, Long> {
}
