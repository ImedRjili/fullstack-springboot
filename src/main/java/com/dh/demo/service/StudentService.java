package com.dh.demo.service;

import com.dh.demo.domain.Student;
import com.dh.demo.repository.StudentRepository;
import com.dh.demo.web.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Juan Zapata on 6/10/2017.
 */
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(StudentController.StudentRequestDTO student){
        Student newStudent = new Student();

        newStudent.setCi(student.getCi());
        newStudent.setName(student.getName());
        newStudent.setCodeSis(student.getCodeSis());

        studentRepository.save(newStudent);
    }
}
