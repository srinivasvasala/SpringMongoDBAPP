package com.srinivas.springmongodbapp.Repository;

import com.srinivas.springmongodbapp.Model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task,String> {
}
