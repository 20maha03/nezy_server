package com.nezy_groups.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nezy_groups.models.Question;
import com.nezy_groups.service.QuestionService;

@RestController
@RequestMapping("/api/v1")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/questions")
    public ResponseEntity<List<Question>> getAll() {
        return questionService.getAll();
    }
    
    @PostMapping("/questions")
    public ResponseEntity<String> addNewQuestion(@RequestBody Question question) {
		return questionService.addNewQuestion(question);
    }
    
    @DeleteMapping("/questions/{id}")
    public ResponseEntity<String> deleteOne(@PathVariable int id) {
		return questionService.deleteOne(id);
    }
    
    @PutMapping("/questions/{id}")
    public ResponseEntity<String> changeOneQuestion(@RequestBody Question question, @PathVariable int id) {
    	return questionService.changeOneQuestion(question,id);
    }
}
