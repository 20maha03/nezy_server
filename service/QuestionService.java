package com.nezy_groups.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.nezy_groups.dao.QuestionDao;
import com.nezy_groups.models.Question;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionDao questionDao;

	public ResponseEntity<List<Question>> getAll() {
    	try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK); 
    	} catch(Exception e) {
    		e.printStackTrace();
    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }
}
