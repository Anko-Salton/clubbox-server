package com.clubboxrest.model.mapper;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clubboxrest.model.Match;

@Repository
public interface MatchInterface extends CrudRepository<Match, Integer>{
	
}
