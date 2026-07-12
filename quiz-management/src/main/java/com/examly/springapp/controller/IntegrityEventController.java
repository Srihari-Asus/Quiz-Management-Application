package com.examly.springapp.controller;

import com.examly.springapp.model.IntegrityEvent;
import com.examly.springapp.service.IntegrityEventService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/integrity-events")
@Tag(name = "Integrity Event API", description = "Operations for managing academic integrity/cheat monitoring records")
public class IntegrityEventController {

    @Autowired
    private IntegrityEventService integrityEventService;

    @PostMapping
    @Operation(summary = "Create a new integrity event")
    public IntegrityEvent addIntegrityEvent(@RequestBody IntegrityEvent event) {
        return integrityEventService.saveIntegrityEvent(event);
    }

    @GetMapping
    @Operation(summary = "Get all integrity events")
    public List<IntegrityEvent> getAllIntegrityEvents() {
        return integrityEventService.getAllIntegrityEvents();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get integrity event by ID")
    public IntegrityEvent getIntegrityEventById(@PathVariable Long id) {
        return integrityEventService.getIntegrityEventById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an integrity event")
    public void deleteIntegrityEvent(@PathVariable Long id) {
        integrityEventService.deleteIntegrityEvent(id);
    }
}
