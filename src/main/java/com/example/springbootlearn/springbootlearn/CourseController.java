package com.example.springbootlearn.springbootlearn;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1, "Spring"),new Course(2, "SpringBoot"),new Course(3,"SpringMVC"));
    }
}
