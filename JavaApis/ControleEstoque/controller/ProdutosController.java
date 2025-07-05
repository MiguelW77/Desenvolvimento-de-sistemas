package com.example.ControleEstoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ControleEstoque.model.ProdutosModel;
import com.example.ControleEstoque.services.ProdutosService;

@RestController


@RequestMapping("/api/produtos")
public class ProdutosController {
        @Autowired
        private ProdutosService servicoprodutos;

        //
    @GetMapping
    public List<ProdutosModel>listarTodos(){
        return servicoprodutos.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutosModel> buscarporId(@PathVariable Long id){
        return servicoprodutos.buscarporId(id)
        .map(ResponseEntity :: ok)
        .orElse(ResponseEntity.notFound().build());
    }
}
