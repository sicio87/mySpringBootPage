package eu.karols.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eu.karols.domain.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> { 
	
}