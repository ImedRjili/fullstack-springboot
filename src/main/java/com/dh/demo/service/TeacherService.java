package com.dh.demo.service;

import com.dh.demo.domain.Teacher;
import com.dh.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Zapata on 6/3/2017.
 */
@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        //TODO use repository
        /*List<Teacher> listTeacher = new ArrayList<Teacher>();

        listTeacher.add(new Teacher("1234","juan zapata",1234,"teacher"));
        listTeacher.add(new Teacher("1235","ramon mercado",1235,"architect"));
        listTeacher.add(new Teacher("1236","lidia zapata",1236,"developer"));

        return listTeacher;*/
        return teacherRepository.findAll();
    }

    public void addTeacher(Teacher newTeacher){
        //TODO add into database
        teacherRepository.save(newTeacher);
        System.out.println("The name of teacher is: "+ newTeacher.getName() +" with id "+newTeacher.getId());
    }

    public Teacher findByID(String id){
        return teacherRepository.getTeacherByID(id);
    }

    public void updateTeacher(Teacher teacher){
        teacherRepository.save(teacher);
        System.out.println(teacher.getId());
    }

    public void deleteTeacher(Teacher deleteTeacher){
        System.out.println(deleteTeacher.getId());
        teacherRepository.delete(deleteTeacher);
    }

    public void deleteTeacherByID(String id){
        teacherRepository.delete(id);
    }
}
