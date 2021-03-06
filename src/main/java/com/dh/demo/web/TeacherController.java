package com.dh.demo.web;

import com.dh.demo.domain.Teacher;
import com.dh.demo.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Juan Zapata on 6/3/2017.
 */
@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTeacher(@RequestBody TeacherRequestDTO newTeacher){
        teacherService.addTeacher(newTeacher);
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public void updateTeacher(@RequestBody Teacher updatedTeacher){
        teacherService.updateTeacher(updatedTeacher);
    }

    /*@RequestMapping(method = RequestMethod.DELETE)
    public void deleteTeacher(@RequestBody Teacher deleteTeacher){
        teacherService.deleteTeacher(deleteTeacher);
    }*/

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteTeacher(@RequestBody String id){
        teacherService.deleteTeacherByID(id);
    }

    public static class TeacherRequestDTO{

        private String name;
        private long ci;
        private String proffesion;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getCi() {
            return ci;
        }

        public void setCi(long ci) {
            this.ci = ci;
        }

        public String getProffesion() {
            return proffesion;
        }

        public void setProffesion(String proffesion) {
            this.proffesion = proffesion;
        }
    }
}
