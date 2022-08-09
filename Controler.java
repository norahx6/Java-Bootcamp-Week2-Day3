package com.example.SpringBootDay1.Week2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {


    @RequestMapping (value = "/name",method = RequestMethod.GET)
    public String helloMessage(){
        return "Norah Abdullah";
    }

    @RequestMapping (value = "/number",method = RequestMethod.GET)
    public String helloMessage2(){
        return "0504644084";
    }

}//end


