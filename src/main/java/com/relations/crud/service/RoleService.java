package com.relations.crud.service;

import com.relations.crud.model.Role;
import com.relations.crud.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService{

    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public void crearUser(Role role) {
        roleRepository.save(role);
    }
}
