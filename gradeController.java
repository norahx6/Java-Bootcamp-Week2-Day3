package com.example.SpringBootDay1.Week2;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class gradeController {

    ArrayList<Integer> grade = new ArrayList<>();

    @GetMapping("/grade")
    public ArrayList getName(){
        return grade;
    }

    @PostMapping ("/grade")
    public String addGrade(@RequestBody int num){
        grade.add(num);
        return "grade add";
    }

    @PutMapping("/grade{index}")
    public String putgrade(@PathVariable int index,@RequestBody int num){
        grade.set(index,num);
        return "grade ubdate";
    }

    @DeleteMapping("/grade{index}")
    public String deleteGrade(@PathVariable int index){
        grade.remove(index);
        return "grade delete";
    }

}//end
