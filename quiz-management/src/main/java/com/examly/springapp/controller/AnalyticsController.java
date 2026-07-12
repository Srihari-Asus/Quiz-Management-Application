package com.examly.springapp.controller;

import com.examly.springapp.model.Analytics;
import com.examly.springapp.service.AnalyticsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/analytics")
@Tag(name = "Analytics API", description = "Operations for retrieving learning and performance analytics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @PostMapping
    @Operation(summary = "Create a new analytics entry")
    public Analytics addAnalytics(@RequestBody Analytics analytics) {
        return analyticsService.saveAnalytics(analytics);
    }

    @GetMapping
    @Operation(summary = "Get all analytics records")
    public List<Analytics> getAllAnalytics() {
        return analyticsService.getAllAnalytics();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get analytics record by ID")
    public Analytics getAnalyticsById(@PathVariable Long id) {
        return analyticsService.getAnalyticsById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an analytics record")
    public void deleteAnalytics(@PathVariable Long id) {
        analyticsService.deleteAnalytics(id);
    }
}
