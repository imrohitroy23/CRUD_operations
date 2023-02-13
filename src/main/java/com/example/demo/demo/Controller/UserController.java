package com.example.demo.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.Model.User;
import com.example.demo.demo.Service.UserService;

@RestController
@RequestMapping("/students")

public class UserController {

    @Autowired
    private UserService studentService;
    
    @GetMapping
    public List<User> getAllStudents() {
        return studentService.getAllStudents();
    }
    
    @GetMapping("/{id}")
    public User getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
    
    @PostMapping
    public User createStudent(@RequestBody User student) {
        return studentService.createStudent(student);
    }
    
    @PutMapping("/{id}")
    public User updateStudent(@PathVariable Long id, @RequestBody User student) {
        return studentService.updateStudent(id, student);
    }
    
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
    
}
