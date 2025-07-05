package com.example.ControleEstoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ControleEstoque.model.SaidaModel;

@Repository
public interface  SaidaRepository extends JpaRepository<SaidaModel, Integer> {

}
