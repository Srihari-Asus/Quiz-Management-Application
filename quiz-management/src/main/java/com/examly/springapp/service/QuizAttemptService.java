package com.examly.springapp.service;

import com.examly.springapp.model.QuizAttempt;
import com.examly.springapp.repository.QuizAttemptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuizAttemptService {

    @Autowired
    private QuizAttemptRepository quizAttemptRepository;

    public QuizAttempt saveQuizAttempt(QuizAttempt attempt) {
        return quizAttemptRepository.save(attempt);
    }

    public List<QuizAttempt> getAllQuizAttempts() {
        return quizAttemptRepository.findAll();
    }

    public QuizAttempt getQuizAttemptById(Long id) {
        return quizAttemptRepository.findById(id).orElse(null);
    }

    public void deleteQuizAttempt(Long id) {
        quizAttemptRepository.deleteById(id);
    }
}
