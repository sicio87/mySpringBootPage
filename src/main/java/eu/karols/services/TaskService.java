package eu.karols.services;

import java.util.List;

import eu.karols.domain.Task;

public interface TaskService {
    List<Task> findAll();
    Task findById(Long id);
    Task create(Task task);
    Task edit(Task task);
    void deleteById(Long id);
}
