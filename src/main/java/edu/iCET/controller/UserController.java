package edu.iCET.controller;

import edu.iCET.model.dto.UserDTO;
import edu.iCET.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{username}")
    public UserDTO getUser(@PathVariable String username){

//        System.out.println("Username received: " + username);

        return userService.getUser(username);
    }


}
