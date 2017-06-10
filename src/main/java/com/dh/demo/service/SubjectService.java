package com.dh.demo.service;

import com.dh.demo.domain.Subject;
import com.dh.demo.repository.SubjectRepository;
import com.dh.demo.web.SubjectController;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Juan Zapata on 6/10/2017.
 */
@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

    public void addSubject(SubjectController.SubjectRequestDTO subject){
        Subject nSubject = new Subject();

        nSubject.setName(subject.getName());
        nSubject.setCode(subject.getCode());

        subjectRepository.save(nSubject);
    }

}
