package com.t7.supplychain.Repository;

import com.t7.supplychain.Entity.Requirement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequirementRepository extends MongoRepository<Requirement,String> {
}
