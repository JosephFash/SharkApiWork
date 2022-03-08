package com.example.shark.service;

import com.example.shark.model.Sharks;
import com.example.shark.repository.SharksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SharksService {

    @Autowired
    private SharksRepository sharksRepository;


    // Gathering Sharks Data
    public List<Sharks> getAllSharks(){
        return SharksRepository.findAll();
    }

    // Gathering Sharks By ID
    public Optional<Sharks> getSharksById(Long SharksId){
        return SharksRepository.findById(SharksId);
    }
}
