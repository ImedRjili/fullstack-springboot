package com.dh.demo.repository;

import com.dh.demo.domain.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Juan Zapata on 6/10/2017.
 */

public interface SubjectRepository extends MongoRepository<Subject,String>{
}
