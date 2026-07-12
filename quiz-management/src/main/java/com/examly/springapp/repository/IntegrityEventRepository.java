package com.examly.springapp.repository;

import com.examly.springapp.model.IntegrityEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegrityEventRepository extends JpaRepository<IntegrityEvent, Long> {
}
