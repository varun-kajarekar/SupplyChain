package com.t7.supplychain.Repository;

import com.t7.supplychain.Entity.SuperviserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SuperviserRepository extends MongoRepository<SuperviserEntity,String> {


}
