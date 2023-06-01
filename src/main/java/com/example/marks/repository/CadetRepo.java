package com.example.marks.repository;

import com.example.marks.models.Cadet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadetRepo extends JpaRepository<Cadet, Long> {
}
