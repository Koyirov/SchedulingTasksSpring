package com.example.schedulingtasksspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksSpringApplication.class, args);
	}

}
