package nl.fhict.mazegamerest.interfaces;

import nl.fhict.mazegamerest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
