package com.akv.session.service;

import com.akv.session.model.User;
import com.akv.session.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class UserService {

    @Autowired(required = true)
    private UserRepository userRepository;
    public String returnHello(String message){
        return "Hello, "+message;
    }

    public List<User> getallUsers(){
        log.info("in this getall users method");
        return userRepository.findAll();
    }
}
