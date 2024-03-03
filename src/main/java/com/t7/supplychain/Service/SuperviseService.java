package com.t7.supplychain.Service;

import com.t7.supplychain.Entity.ResponseEntity;
import com.t7.supplychain.Entity.SuperviserEntity;
import com.t7.supplychain.Entity.Requirement;

import java.util.List;

public interface SuperviseService {
    SuperviserEntity AddSuperViser(SuperviserEntity superviserEntity);

    ResponseEntity login(SuperviserEntity superviserEntity);

    Requirement AddVendorOrder(Requirement vendorOrderEntity);

    Requirement addrequirement(Requirement requirement);

    List<Requirement> getRequirement();
}
