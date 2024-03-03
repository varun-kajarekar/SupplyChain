package com.t7.supplychain.Controller;

import com.t7.supplychain.Entity.MailStructure;
import com.t7.supplychain.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController
public class MailController {

    @Autowired
    MailService mailService;

    @PostMapping("/send/{mail}")
    public MailStructure sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure){
        mailService.sendMail(mail,mailStructure);
        return mailStructure;

    }
}
