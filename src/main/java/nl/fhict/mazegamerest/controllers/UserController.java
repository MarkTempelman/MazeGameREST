package nl.fhict.mazegamerest.controllers;

import nl.fhict.mazegamerest.models.User;
import nl.fhict.mazegamerest.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/all/user")
    public void registerUser(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping("/member/current")
    public User getCurrentUser(){
        return userService.getCurrentUser();
    }

    @GetMapping("/member/user")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
