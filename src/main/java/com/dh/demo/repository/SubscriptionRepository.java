package com.dh.demo.repository;

import com.dh.demo.domain.Subscription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Juan Zapata on 6/10/2017.
 */
public interface SubscriptionRepository extends MongoRepository<Subscription,String>{

}
