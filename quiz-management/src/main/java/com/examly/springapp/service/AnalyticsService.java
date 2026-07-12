package com.examly.springapp.service;

import com.examly.springapp.model.Analytics;
import com.examly.springapp.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnalyticsService {

    @Autowired
    private AnalyticsRepository analyticsRepository;

    public Analytics saveAnalytics(Analytics analytics) {
        return analyticsRepository.save(analytics);
    }

    public List<Analytics> getAllAnalytics() {
        return analyticsRepository.findAll();
    }

    public Analytics getAnalyticsById(Long id) {
        return analyticsRepository.findById(id).orElse(null);
    }

    public void deleteAnalytics(Long id) {
        analyticsRepository.deleteById(id);
    }
}
