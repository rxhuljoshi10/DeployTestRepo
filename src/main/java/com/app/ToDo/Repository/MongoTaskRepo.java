package com.app.ToDo.Repository;

import com.app.ToDo.Model.TaskEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface MongoTaskRepo extends MongoRepository<TaskEntity, String>{
}
