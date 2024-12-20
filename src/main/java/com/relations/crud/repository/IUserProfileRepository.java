package com.relations.crud.repository;

import com.relations.crud.model.Post;
import com.relations.crud.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserProfileRepository extends JpaRepository<UserProfile, Integer> {
}

