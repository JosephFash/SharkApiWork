package com.example.springducks.repo;

import com.example.springducks.entity.Duck
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuckRepo extends JpaRepository <Duck, Long> {
}
