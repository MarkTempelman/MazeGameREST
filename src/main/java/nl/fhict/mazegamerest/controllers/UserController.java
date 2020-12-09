package nl.fhict.mazegamerest.controllers;

import nl.fhict.mazegamerest.models.User;
import nl.fhict.mazegamerest.services.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/user")
    public void registerUser(@RequestBody User user){
        service.save(user);
    }
}
