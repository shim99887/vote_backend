package com.rhdck.vote.controller;

import com.rhdck.vote.entity.User;
import com.rhdck.vote.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping
    public List<User> test(){
        List<User> list;
        list = repo.findAll();
        return list;
    }

    @PostMapping
    public ResponseEntity<User> login(@RequestBody Map<String, String> map){
        User user = repo.login(map.get("id"), map.get("password"));

        if(user == null){
            return new ResponseEntity<User>(new User(), HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
    }
}
