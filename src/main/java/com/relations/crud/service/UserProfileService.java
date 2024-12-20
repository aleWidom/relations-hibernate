package com.relations.crud.service;

import com.relations.crud.model.UserProfile;
import com.relations.crud.repository.IUserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService implements IUserProfileService {
    @Autowired
    private IUserProfileRepository userProfileRepository;
    @Override
    public void crearUser(UserProfile userProfile) {
        userProfileRepository.save(userProfile);
    }
}
