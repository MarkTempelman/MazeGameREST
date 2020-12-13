package nl.fhict.mazegamerest.services;

import nl.fhict.mazegamerest.interfaces.UserRepository;
import nl.fhict.mazegamerest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository repo, PasswordEncoder passwordEncoder){
        this.repo = repo;
        this.passwordEncoder = passwordEncoder;
    }

    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }

    public List<User> getAllUsers(){
        return repo.findAll();
    }

    public User getCurrentUser(){
        return getUserByName(SecurityContextHolder.getContext().getAuthentication().getName());
    }

    public User getUserByName(String username){
        return repo.findByUsername(username);
    }
}
