package com.example.BEshoes.repository;
import com.example.BEshoes.model.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoesRepository extends JpaRepository<Shoe, Long> {
}