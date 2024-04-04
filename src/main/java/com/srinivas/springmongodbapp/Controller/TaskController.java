package com.srinivas.springmongodbapp.Controller;

import com.srinivas.springmongodbapp.Model.Task;
import com.srinivas.springmongodbapp.Service.Impl.TaskServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    private final TaskServiceImpl taskService;

    private TaskController(TaskServiceImpl taskService){
        this.taskService=taskService;
    }
    @RequestMapping("/tasks")
    @PostMapping("/addTask")
    public ResponseEntity<Task> addTask(@RequestBody Task task){
        return ResponseEntity.ok(taskService.addTask(task));
    }
    @GetMapping("/getTask")
    public ResponseEntity<Task>getTask(String id){
        return ResponseEntity.ok(taskService.getTaskById(id));
    }
    @GetMapping("/getAllTasks")
    public ResponseEntity<Iterable<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }
    @GetMapping("/deleteTask")
    public ResponseEntity<Task> deleteTask(String id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/updateTask")
    public ResponseEntity<Task> updateTask( @RequestBody Task task) {
        return ResponseEntity.ok(taskService.updateTask(task));
    }
}
