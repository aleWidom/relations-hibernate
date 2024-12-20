package com.relations.crud.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String phone;
    private String address;
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public UserProfile() {
    }

    public UserProfile(String address, String phone, User user) {
        this.address = address;
        this.phone = phone;
        this.user= user;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                '}';
    }
}
