package nl.fhict.mazegamerest.services;

import nl.fhict.mazegamerest.interfaces.UserRepository;
import nl.fhict.mazegamerest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo){
        this.repo = repo;
    }

    public void save(User user){
        repo.save(user);
    }
}
