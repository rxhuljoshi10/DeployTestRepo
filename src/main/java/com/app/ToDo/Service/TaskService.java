package com.app.ToDo.Service;

import com.app.ToDo.Model.TaskEntity;
import com.app.ToDo.Repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    public TaskRepo taskRepo;

    public List<TaskEntity> displayTasks(){
        List<TaskEntity> all = taskRepo.findAll();
        return all;
    }

    public TaskEntity addTask(TaskEntity taskEntity){
        return taskRepo.save(taskEntity);
    }

    public TaskEntity updateTodo(TaskEntity taskEntity) {
        return taskRepo.save(taskEntity);
    }

    public void deleteTodoById(Long id) {

        taskRepo.deleteById(id);
    }
}
