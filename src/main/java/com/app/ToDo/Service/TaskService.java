package com.app.ToDo.Service;

import com.app.ToDo.Model.TaskEntity;
import com.app.ToDo.Repository.MongoTaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
//    @Autowired
//    public TaskRepo taskRepo;
    @Autowired
    public MongoTaskRepo mongoTaskRepo;

    public List<TaskEntity> displayTasks(){
        List<TaskEntity> all = mongoTaskRepo.findAll();
        return all;
    }

    public TaskEntity addTask(TaskEntity taskEntity){
        return mongoTaskRepo.save(taskEntity);
    }

    public TaskEntity updateTodo(TaskEntity taskEntity) {
        return mongoTaskRepo.save(taskEntity);
    }

    public void deleteTodoById(String id) {
        mongoTaskRepo.deleteById(id);
    }
}
