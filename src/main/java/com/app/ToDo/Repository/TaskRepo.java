package com.app.ToDo.Repository;

import com.app.ToDo.Model.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TaskRepo extends JpaRepository<TaskEntity, Long> {
}
