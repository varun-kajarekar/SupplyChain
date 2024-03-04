package com.t7.supplychain.Controller;

import com.t7.supplychain.Entity.Requirement;
import com.t7.supplychain.Entity.SupervisorReq;
import com.t7.supplychain.Service.SuperviseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Random;

@CrossOrigin()
@RestController
public class Inventory {
    @Autowired
    SuperviseService superviseService;


    @PostMapping("/add-requirement")
    public Requirement addrequirement(@RequestBody Requirement requirement){

        return superviseService.addrequirement(requirement);
    }
    @GetMapping("/get-requirement")
    public List<Requirement> getRequirement(){
        return superviseService.getRequirement();
    }

    @PostMapping("/add-vendor-req")
    public SupervisorReq addvendorReq(@RequestBody SupervisorReq supervisorReq){

        return superviseService.addvendorReq(supervisorReq);
    }

    @GetMapping("/get-vendor-req")
    public List<SupervisorReq> getvendorReq(){

        return superviseService.getvendorReq();
    }

}
