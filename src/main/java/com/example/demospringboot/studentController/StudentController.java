package com.example.demospringboot.studentController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private List<studenInformation> listStudents = new ArrayList<>();
    @PostMapping("/param")
    public ResponseEntity<?> addStudentByParam (@RequestParam String name, @RequestParam int tuoi){
        studenInformation s = new studenInformation();
        s.setName(name);
        s.setTuoi(tuoi);
        listStudents.add(s);
        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }
    @PostMapping("/body")
    public ResponseEntity<?> addStudentByBody (@RequestBody studenInformation s){
        listStudents.add(s);
        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }
    @PostMapping("/path/{name}/{tuoi}")
    public ResponseEntity<?> addStudentByPath (@PathVariable String name, @PathVariable int tuoi){
        studenInformation s = new studenInformation();
        s.setName(name);
        s.setTuoi(tuoi);
        listStudents.add(s);
        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }

}
