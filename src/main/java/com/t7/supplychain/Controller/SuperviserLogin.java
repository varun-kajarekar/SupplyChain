package com.t7.supplychain.Controller;

import com.t7.supplychain.Entity.ResponseEntity;
import com.t7.supplychain.Entity.SuperviserEntity;
import com.t7.supplychain.Service.SuperviseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class SuperviserLogin {

    @Autowired
    SuperviseService superviseService;



    @PostMapping("/login")
    public ResponseEntity Login(@RequestBody SuperviserEntity superviserEntity){
        return superviseService.login(superviserEntity);
    }

    @PostMapping("/signup")
    public SuperviserEntity Regester(@RequestBody SuperviserEntity superviserEntity){
        return superviseService.AddSuperViser(superviserEntity);
    }


}
