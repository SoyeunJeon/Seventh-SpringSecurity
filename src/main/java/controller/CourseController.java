package controller;

import model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CourseService;

import java.util.List;

/**
 * Created by 전소연 on 11/16/2017.
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(path = "/courses", method = RequestMethod.GET)
    public List<Course> getStudents(){
        return courseService.getAllCourses();
    }

    @RequestMapping(path="/courses/{id}", method = RequestMethod.GET)
    public Course getCourse(@PathVariable int id){
        return courseService.getCourse(id);
    }

    @RequestMapping(path = "/courses", method = RequestMethod.POST)
    public void saveCourse(@RequestBody Course course){
        courseService.saveCourse(course);
    }
}