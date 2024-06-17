package com.nezy_groups.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}
