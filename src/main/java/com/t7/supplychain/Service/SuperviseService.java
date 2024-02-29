package com.t7.supplychain.Service;

import com.t7.supplychain.Entity.ResponseEntity;
import com.t7.supplychain.Entity.SuperviserEntity;
import com.t7.supplychain.Entity.VendorOrderEntity;

public interface SuperviseService {
    SuperviserEntity AddSuperViser(SuperviserEntity superviserEntity);

    ResponseEntity login(SuperviserEntity superviserEntity);

    VendorOrderEntity AddVendorOrder(VendorOrderEntity vendorOrderEntity);
}
