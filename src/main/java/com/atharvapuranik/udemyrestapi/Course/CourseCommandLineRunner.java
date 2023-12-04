package com.atharvapuranik.udemyrestapi.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private SpringDataJpa springDataJpa;

    @Override
    public void run(String... args) throws Exception {

        springDataJpa.save(new Course(1,"Oracle","Atharva"));
        springDataJpa.save(new Course(2,"AWS","Atharva"));
        springDataJpa.save(new Course(3,"Azure","Atharva"));
        springDataJpa.save(new Course(4,"GCP","Atharva"));
        springDataJpa.deleteById(1);
        System.out.println(springDataJpa.findById(3));
        System.out.println(springDataJpa.findByName("AWS"));
    }
}
