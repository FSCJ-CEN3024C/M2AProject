package edu.fscj.cen3024c.taskmanager.repository;

import edu.fscj.cen3024c.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    // Find all tasks
    List<Task> findAll();
}
