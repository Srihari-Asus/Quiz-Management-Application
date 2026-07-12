package com.examly.springapp.service;

import com.examly.springapp.model.Gradebook;
import com.examly.springapp.repository.GradebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GradebookService {

    @Autowired
    private GradebookRepository gradebookRepository;

    public Gradebook saveGradebook(Gradebook gradebook) {
        return gradebookRepository.save(gradebook);
    }

    public List<Gradebook> getAllGradebook() {
        return gradebookRepository.findAll();
    }

    public Gradebook getGradebookById(Long id) {
        return gradebookRepository.findById(id).orElse(null);
    }

    public void deleteGradebook(Long id) {
        gradebookRepository.deleteById(id);
    }
}
