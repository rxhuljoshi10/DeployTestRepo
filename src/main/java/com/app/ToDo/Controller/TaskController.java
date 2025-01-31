package com.app.ToDo.Controller;

import com.app.ToDo.Model.TaskEntity;
import com.app.ToDo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
//@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<TaskEntity> getTasks(){
        return taskService.displayTasks();
    }

    @PostMapping
    public TaskEntity addTask(@RequestBody TaskEntity taskEntity){
        return taskService.addTask(taskEntity);
    }

    @PutMapping("/{id}")
    public TaskEntity updateTodo(@PathVariable String id, @RequestBody TaskEntity taskEntity) {
        taskEntity.setId(id);
        return taskService.updateTodo(taskEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable String id) {
        taskService.deleteTodoById(id);
    }
}
