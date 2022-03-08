package com.example.shark.repository;

import com.example.shark.model.Sharks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SharksRepository extends JpaRepository <Sharks, Long>{


}
