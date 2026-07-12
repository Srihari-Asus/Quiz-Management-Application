package com.examly.springapp.service;

import com.examly.springapp.model.IntegrityEvent;
import com.examly.springapp.repository.IntegrityEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IntegrityEventService {

    @Autowired
    private IntegrityEventRepository integrityEventRepository;

    public IntegrityEvent saveIntegrityEvent(IntegrityEvent event) {
        return integrityEventRepository.save(event);
    }

    public List<IntegrityEvent> getAllIntegrityEvents() {
        return integrityEventRepository.findAll();
    }

    public IntegrityEvent getIntegrityEventById(Long id) {
        return integrityEventRepository.findById(id).orElse(null);
    }

    public void deleteIntegrityEvent(Long id) {
        integrityEventRepository.deleteById(id);
    }
}
