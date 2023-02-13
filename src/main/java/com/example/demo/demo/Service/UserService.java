package com.example.demo.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.demo.Model.User;
import com.example.demo.demo.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository studentRepository;
    
    public List<User> getAllStudents() {
        return studentRepository.findAll();
    }
    
    public User getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    
    public User createStudent(User student) {
        return studentRepository.save(student);
    }
    
    public User updateStudent(Long id, User student) {
        User existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setAge(student.getAge());
            return studentRepository.save(existingStudent);
        }
        return null;
    }
    
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    
}
