package com.atharvapuranik.udemyrestapi.Course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class CourseController {

    @GetMapping("/")
    public List<Course> getCourse(){
        return Arrays.asList(
                new Course(1,"Spring Boot", "Atharva"),
                new Course(2,"Spring Boot", "Atharva")
        );
    }
}
