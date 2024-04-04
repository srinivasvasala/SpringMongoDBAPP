package com.srinivas.springmongodbapp.Service;

import com.srinivas.springmongodbapp.Model.Task;

import java.util.List;

public interface TaskService {
    public Task addTask(Task task);
    public List<Task>getAllTasks();
    public Task getTaskById(String id);
    public Task updateTask(Task task);
    public void deleteTask(String id);
}
