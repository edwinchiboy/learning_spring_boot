package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
   // @GetMapping
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
            new Course(1, "Learn AWS", "In 28 munites"),
            new Course(2, "Learn Devops", "In 28 munites"),
            new Course(3, "Learn Azure", "In 28 munites"),
            new Course(3, "Learn Azure", "In 28 munites")




            );
    }
}
