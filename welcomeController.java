package com.example.SpringBootDay1.Week2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {


@RequestMapping (path ="/hey",method = RequestMethod.GET)
    public String getHey(){
        return"Hey From Spring";
    }
    @RequestMapping (path ="/bay",method = RequestMethod.GET)
    public String getBay(){
        return"bay";
    }
    @RequestMapping (path ="/check/status",method = RequestMethod.GET)
    public String getCheckstatu(){
        return"Everything OK";
    }

    @RequestMapping (path ="/health",method = RequestMethod.GET)
    public String getHealth(){
        return"Server health is up and runing";
    }

}//end
