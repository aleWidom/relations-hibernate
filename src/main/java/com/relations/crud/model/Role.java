package com.relations.crud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String permiso;
    @ManyToMany(mappedBy = "roles")
    private List<User> listUsers;

    public Role() {
    }

    public Role(Integer id, String permiso, List<User> listUsers) {
        this.id = id;
        this.permiso = permiso;
        this.listUsers = listUsers;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", permiso='" + permiso + '\'' +
                ", listUsers=" + listUsers +
                '}';
    }
}
