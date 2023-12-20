package controllers;


import documents.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.UserService;

import java.util.Random;
import java.util.UUID;


/**
 * Created by: Andrew Lee
 * User Controller that handles all the logic relative to End Points
 */
@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserController {


    UserService userService;

    Random random = new Random();
    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@RequestBody User user){

        user.setUuid(random.nextLong());
        user.setName(user.getName());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        userService.createUser(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
