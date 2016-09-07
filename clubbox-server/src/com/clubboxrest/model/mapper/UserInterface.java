package com.clubboxrest.model.mapper;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clubboxrest.model.User;

@Repository
public interface UserInterface extends CrudRepository<User, Integer> {
	
}
