package com.examly.springapp.controller;

import com.examly.springapp.model.Question;
import com.examly.springapp.service.QuestionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/questions")
@Tag(name = "Question API", description = "Operations for managing questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    @Operation(summary = "Create a new question")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }

    @GetMapping
    @Operation(summary = "Get all questions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a question by ID")
    public Question getQuestionById(@PathVariable Long id) {
        return questionService.getQuestionById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a question")
    public void deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
    }
}
