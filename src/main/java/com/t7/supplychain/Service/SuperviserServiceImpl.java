package com.t7.supplychain.Service;

import com.t7.supplychain.Entity.ResponseEntity;
import com.t7.supplychain.Entity.SuperviserEntity;
import com.t7.supplychain.Entity.Requirement;
import com.t7.supplychain.Entity.SupervisorReq;
import com.t7.supplychain.Repository.RequirementRepository;
import com.t7.supplychain.Repository.SuperviserRepository;
import com.t7.supplychain.Repository.SupervisorReqRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SuperviserServiceImpl implements SuperviseService{

    @Autowired
    SuperviserRepository superviserRepository;

    @Autowired
    RequirementRepository requirementRepository;

    @Autowired
    ResponseEntity response;

    @Autowired
    SupervisorReqRepo supervisorReqRepo;

    @Override
    public SuperviserEntity AddSuperViser(SuperviserEntity superviserEntity) {
        return superviserRepository.save(superviserEntity);
    }

    @Override
    public ResponseEntity login(SuperviserEntity superviserEntity) {
        String username = superviserEntity.getEmail();
        String password = superviserEntity.getPassword();

        if(superviserRepository.existsById(username)){
            SuperviserEntity userFromDB = superviserRepository.findById(username).get();
            if(userFromDB.getEmail().equals(username) && userFromDB.getPassword().equals(password)){
                response.setToken(username);
                response.setMsg("Login successful");
                return response;
            }

        }
        response.setToken("");
        response.setMsg("Login Failed");
        return response;
    }

    @Override
    public Requirement AddVendorOrder(Requirement vendorOrderEntity) {
        return null;
    }


    @Override
    public Requirement addrequirement(Requirement requirement) {
        requirementRepository.save(requirement);
        return requirement;
    }

    @Override
    public List<Requirement> getRequirement() {
        return requirementRepository.findAll();
    }

    @Override
    public SupervisorReq addvendorReq(SupervisorReq supervisorReq) {
        supervisorReqRepo.save(supervisorReq);
        return supervisorReq;
    }

    @Override
    public List<SupervisorReq> getvendorReq() {
        List<SupervisorReq> reqD = supervisorReqRepo.findAll();
        Collections.sort(reqD, (SupervisorReq a1, SupervisorReq a2) -> a1.getBudget() - a2.getBudget());
        return reqD;
    }
}
