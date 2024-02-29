package com.t7.supplychain.Repository;

import com.t7.supplychain.Entity.VendorOrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendorOrder extends MongoRepository<VendorOrderEntity,Integer> {
}
