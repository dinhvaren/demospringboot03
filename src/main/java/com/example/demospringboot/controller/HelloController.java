package com.example.demospringboot.controller;

import com.example.demospringboot.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
//    tham số truyền trên trình duyệt: @RequestParam
//    tham số truyền ngầm: @RequestParam
//    tham số đóng vai trò như là một đường dẫn @PathVariable
//    tham số ngầm là đối tượng: @ResquestBody
 @GetMapping("")
    public String hello (@RequestParam String hoten, @RequestParam int tuoi){

     return "Hello page: " + hoten + "tuoi: " + tuoi;
 }
@PostMapping("/cybersoft")
    public String helloCybersoft (@RequestBody LoginRequest loginRequest){

        return "helloCybersoft" + loginRequest.getUsername() + " - " + loginRequest.getPassword();
    }
@PutMapping("/update/{id}")
     public ResponseEntity<String> update(@PathVariable int id){

     return new ResponseEntity<>("Update" + id, HttpStatus.OK) ;
}
}
