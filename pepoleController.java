package com.example.SpringBootDay1.Week2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class pepoleController {

    ArrayList<String>name=new ArrayList<>();

    @GetMapping("/name")
    public ArrayList getName(){
      return name;
    }

    @PostMapping("/name")
    public String addName(@RequestBody String names){
        name.add(names);
        return "Name added";
    }

    @PutMapping("name{index}")
    public String putName(@PathVariable int index , @RequestBody String names){
        name.set(index,names);
        return "Name Updated";
    }

    @DeleteMapping ("name{index}")
    public String deleteName(@PathVariable int index ){
        name.remove(index);
        return "Name Deleted";
    }

}//end
