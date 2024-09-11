package edu.fscj.cen3024c.taskmanager;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class M2AProjectApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(M2AProjectApplication.class, args);
//	}
//
//}


import edu.fscj.cen3024c.taskmanager.entity.Task;
import edu.fscj.cen3024c.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories("edu.fscj.cen3024c.taskmanager.repository")
public class M2AProjectApplication implements CommandLineRunner {

	@Autowired
	private TaskRepository taskRepository;

	public static void main(String[] args) {
		SpringApplication.run(M2AProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Add some tasks for testingx
		Task task1 = new Task();
		task1.setTitle("Test Task 1");
		task1.setDescription("This is task 1");
		task1.setStatus("To-Do");
		taskRepository.save(task1);

		Task task2 = new Task();
		task2.setTitle("Test Task 2");
		task2.setDescription("This is task 2");
		task2.setStatus("In Progress");
		taskRepository.save(task2);

		// Call the findAll() method to test it
		List<Task> tasks = taskRepository.findAll();

		// Print the results to verify
		System.out.println("All tasks in the database:");
		tasks.forEach(task -> System.out.println(task.getTitle() + ": " + task.getDescription()));
	}
}
