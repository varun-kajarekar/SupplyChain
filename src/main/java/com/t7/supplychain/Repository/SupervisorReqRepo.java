package com.t7.supplychain.Repository;

import com.t7.supplychain.Entity.SupervisorReq;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupervisorReqRepo extends MongoRepository<SupervisorReq,String> {
}
