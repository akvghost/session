package com.akv.session.controller;

import com.akv.session.model.User;
import com.akv.session.repository.UserRepository;
import com.akv.session.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "message") String message){
        return userService.returnHello(message);
    }


    @GetMapping("/get")
    public List<User> getall(){
        return userService.getallUsers();
    }
//
//    @PostMapping("create")
//    public User createUser(@RequestBody User user){
//        return userRepository.save(user);
//    }

}
