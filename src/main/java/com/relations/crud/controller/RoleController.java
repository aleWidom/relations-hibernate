package com.relations.crud.controller;
import com.relations.crud.model.Role;
import com.relations.crud.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    private IRoleService roleService;
    @PostMapping("/role")
    public void crearRole(@RequestBody Role role) {
        roleService.crearUser(role);
    }
}
