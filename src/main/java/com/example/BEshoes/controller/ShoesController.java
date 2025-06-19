package com.example.BEshoes.controller;

import com.example.BEshoes.model.Shoe;
import com.example.BEshoes.repository.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shoes")
public class ShoesController {
    @Autowired
    private ShoesRepository shoesRepo;

    @GetMapping
    public List<Shoe> getAllShoes() {
        return shoesRepo.findAll();
    }
}