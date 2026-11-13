package com.example.tasks.service;

import com.example.tasks.exception.TaskNotFoundException;
import com.example.tasks.model.Task;
import com.example.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repo;

    // Constructor injection: Spring hands us the repository
    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> getAll() {
        return repo.findAll();
    }

    public Task get(Long id) {
        return repo.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
    }

    public Task save(Task t) {
        return repo.save(t);
    }

    public Task update(Long id, Task updated) {
        Task existing = get(id);
        existing.setTitle(updated.getTitle());
        existing.setDone(updated.isDone());
        return repo.save(existing);
    }

    public void delete(Long id) {
        get(id); // throws 404 if it does not exist
        repo.deleteById(id);
    }
}
