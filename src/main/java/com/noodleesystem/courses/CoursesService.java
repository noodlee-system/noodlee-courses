package com.noodleesystem.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import serilogj.Log;

@SpringBootApplication
public class CoursesService {
    public static void main(String[] args) {
		SpringApplication.run(CoursesService.class, args);

        Log.information("{serviceName} is running...", "Courses Service");
	}
}
