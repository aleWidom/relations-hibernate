package com.relations.crud.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String username;
    private String lastname;
    private String firstname;
    private String country;
    private String password;

    //relacion unidireccional (crea una tabla intermedia)
    /*@OneToMany
    private List<Post> listaPosts;*/

    //relacion bidireccional
    @OneToMany(mappedBy = "user")
    private List<Post> listaPosts;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;

    public User() {
    }

    public User(Integer id, String username, String lastname, String firstname, String country, String password, List<Post> listaPosts, List<Role> roles) {
        this.id = id;
        this.username = username;
        this.lastname = lastname;
        this.firstname = firstname;
        this.country = country;
        this.password = password;
        this.listaPosts = listaPosts;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", country='" + country + '\'' +
                ", password='" + password + '\'' +
                ", listaPosts=" + listaPosts +
                ", roles=" + roles +
                '}';
    }
}
