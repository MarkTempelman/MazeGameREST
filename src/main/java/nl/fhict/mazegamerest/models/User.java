package nl.fhict.mazegamerest.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Getter @Setter
    private Integer id;

    @Getter @Setter
    @Column(name="username")
    private String username;

    @Getter @Setter
    @Column(name="password")
    private String password;

    public User(){

    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
}
