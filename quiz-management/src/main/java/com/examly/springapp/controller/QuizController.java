package com.examly.springapp.controller;

import com.examly.springapp.model.Quiz;
import com.examly.springapp.service.QuizService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
@Tag(name = "Quiz API", description = "Operations for managing quizzes")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    @Operation(summary = "Create a new quiz")
    public Quiz addQuiz(@RequestBody Quiz quiz) {
        return quizService.saveQuiz(quiz);
    }

    @GetMapping
    @Operation(summary = "Get all quizzes")
    public List<Quiz> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }
}
