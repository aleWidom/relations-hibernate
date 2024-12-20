package com.relations.crud.controller;

import com.relations.crud.model.User;
import com.relations.crud.model.UserProfile;
import com.relations.crud.service.IUserProfileService;
import com.relations.crud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {
    @Autowired
    private IUserProfileService userProfileService;
    @PostMapping("/userProfile")
    public void crearUserProfile(@RequestBody UserProfile userProfile) {
        userProfileService.crearUser(userProfile);
    }

}



