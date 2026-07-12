package com.examly.springapp.controller;

import com.examly.springapp.model.Response;
import com.examly.springapp.service.ResponseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/responses")
@Tag(name = "Response API", description = "Operations for managing question-level responses")
public class ResponseController {

    @Autowired
    private ResponseService responseService;

    @PostMapping
    @Operation(summary = "Create a new response")
    public Response addResponse(@RequestBody Response response) {
        return responseService.saveResponse(response);
    }

    @GetMapping
    @Operation(summary = "Get all responses")
    public List<Response> getAllResponses() {
        return responseService.getAllResponses();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a response by ID")
    public Response getResponseById(@PathVariable Long id) {
        return responseService.getResponseById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a response")
    public void deleteResponse(@PathVariable Long id) {
        responseService.deleteResponse(id);
    }
}
