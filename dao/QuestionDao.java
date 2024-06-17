package com.nezy_groups.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nezy_groups.models.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

	
	
}

