package com.t7.supplychain.Service;

import com.t7.supplychain.Entity.ResponseEntity;
import com.t7.supplychain.Entity.SuperviserEntity;

public interface SuperviseService {
    SuperviserEntity AddSuperViser(SuperviserEntity superviserEntity);

    ResponseEntity login(SuperviserEntity superviserEntity);
}