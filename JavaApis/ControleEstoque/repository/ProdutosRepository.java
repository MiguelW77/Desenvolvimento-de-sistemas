package com.example.ControleEstoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ControleEstoque.model.ProdutosModel;

@Repository
public interface  ProdutosRepository extends JpaRepository<ProdutosModel, Long> {

}
