package com.t7.supplychain.Controller;

import com.t7.supplychain.Entity.Requirement;
import com.t7.supplychain.Service.SuperviseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@CrossOrigin()
@RestController
public class Inventory {
    @Autowired
    SuperviseService superviseService;



    @GetMapping("/inventory")
    public void InventoryData() throws IOException {
        URL url = new URL("https://api.thingspeak.com/channels/2449850/feeds/last.json?api_key=30VOJ2TIWYNRRKYE");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        //System.out.println(content.);
    }


    @PostMapping("/add-requirement")
    public Requirement addrequirement(@RequestBody Requirement requirement){
        return superviseService.addrequirement(requirement);
    }
    @GetMapping("/get-requirement")
    public List<Requirement> getRequirement(){
        return superviseService.getRequirement();
    }
}
