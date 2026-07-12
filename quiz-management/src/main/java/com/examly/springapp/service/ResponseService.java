package com.examly.springapp.service;

import com.examly.springapp.model.Response;
import com.examly.springapp.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    public Response saveResponse(Response response) {
        return responseRepository.save(response);
    }

    public List<Response> getAllResponses() {
        return responseRepository.findAll();
    }

    public Response getResponseById(Long id) {
        return responseRepository.findById(id).orElse(null);
    }

    public void deleteResponse(Long id) {
        responseRepository.deleteById(id);
    }
}
