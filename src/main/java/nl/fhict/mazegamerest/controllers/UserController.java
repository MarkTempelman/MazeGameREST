package nl.fhict.mazegamerest.controllers;

import nl.fhict.mazegamerest.models.User;
import nl.fhict.mazegamerest.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/all/user")
    public void registerUser(@RequestBody User user){
        service.save(user);
    }

    @GetMapping("/member/user")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
}
