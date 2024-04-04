package com.srinivas.springmongodbapp.Service.Impl;

import com.srinivas.springmongodbapp.Model.Task;
import com.srinivas.springmongodbapp.Repository.TaskRepository;
import com.srinivas.springmongodbapp.Service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository  taskRepository;
    @Override
    public Task addTask(Task task) {
        task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(String id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(String id) {
        taskRepository.deleteById(id);
        log.atInfo().log("Task deleted successfully");
    }
}
