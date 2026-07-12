package com.examly.springapp.controller;

import com.examly.springapp.model.QuizAttempt;
import com.examly.springapp.service.QuizAttemptService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/attempts")
@Tag(name = "Quiz Attempt API", description = "Operations for managing quiz attempts")
public class QuizAttemptController {

    @Autowired
    private QuizAttemptService quizAttemptService;

    @PostMapping
    @Operation(summary = "Create a new quiz attempt")
    public QuizAttempt addQuizAttempt(@RequestBody QuizAttempt attempt) {
        return quizAttemptService.saveQuizAttempt(attempt);
    }

    @GetMapping
    @Operation(summary = "Get all quiz attempts")
    public List<QuizAttempt> getAllQuizAttempts() {
        return quizAttemptService.getAllQuizAttempts();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a quiz attempt by ID")
    public QuizAttempt getQuizAttemptById(@PathVariable Long id) {
        return quizAttemptService.getQuizAttemptById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a quiz attempt")
    public void deleteQuizAttempt(@PathVariable Long id) {
        quizAttemptService.deleteQuizAttempt(id);
    }
}
