package com.relations.crud.service;

import com.relations.crud.model.User;
import com.relations.crud.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void crearUser(User user) {
        userRepository.save(user);
    }
}
