package com.dh.demo.service;

import com.dh.demo.domain.Student;
import com.dh.demo.domain.Subject;
import com.dh.demo.domain.Subscription;
import com.dh.demo.domain.Teacher;
import com.dh.demo.repository.StudentRepository;
import com.dh.demo.repository.SubjectRepository;
import com.dh.demo.repository.SubscriptionRepository;
import com.dh.demo.repository.TeacherRepository;
import com.dh.demo.web.SubscriptionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Juan Zapata on 6/10/2017.
 */
@Service
public class SubscriptionService {

    @Autowired
    SubscriptionRepository subscriptionRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    SubjectRepository subjectRepository;

    public List<Subscription> getAllSubscriptions(){
        return subscriptionRepository.findAll();
    }

    public void addSubscription(SubscriptionController.SubsciptionRequestDTO subscription){
        Subscription nSubscription = new Subscription();

        Student student = studentRepository.findOne(subscription.getStudentId());
        Teacher teacher = teacherRepository.findOne(subscription.getTeacherId());
        Subject subject = subjectRepository.findOne(subscription.getSubjectId());

        nSubscription.setSubDate(subscription.getSubDate());
        nSubscription.setStudent(student);
        nSubscription.setTeacher(teacher);
        nSubscription.setSubject(subject);

        subscriptionRepository.save(nSubscription);
    }
}
