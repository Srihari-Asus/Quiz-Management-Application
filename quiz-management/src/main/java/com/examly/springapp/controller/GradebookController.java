package com.examly.springapp.controller;

import com.examly.springapp.model.Gradebook;
import com.examly.springapp.service.GradebookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/gradebook")
@Tag(name = "Gradebook API", description = "Operations for managing gradebook records")
public class GradebookController {

    @Autowired
    private GradebookService gradebookService;

    @PostMapping
    @Operation(summary = "Create a new gradebook entry")
    public Gradebook addGradebook(@RequestBody Gradebook gradebook) {
        return gradebookService.saveGradebook(gradebook);
    }

    @GetMapping
    @Operation(summary = "Get all gradebook records")
    public List<Gradebook> getAllGradebook() {
        return gradebookService.getAllGradebook();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a gradebook record by ID")
    public Gradebook getGradebookById(@PathVariable Long id) {
        return gradebookService.getGradebookById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a gradebook record")
    public void deleteGradebook(@PathVariable Long id) {
        gradebookService.deleteGradebook(id);
    }
}
