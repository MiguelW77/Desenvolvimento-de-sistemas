package com.example.ControleEstoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ControleEstoque.model.SaidaModel;
import com.example.ControleEstoque.services.SaidaService;


@RestController

@RequestMapping("/api/saida")
public class SaidaController {
    @Autowired
    private SaidaService saidaservico;
    

    @GetMapping
    public List<SaidaModel>ListarTodos(){
        return saidaservico.ListarTodos();
    }
@GetMapping("/{id}")
public ResponseEntity<SaidaModel> buscarporId(@PathVariable Integer id){
    return saidaservico.buscarporId(id)
    .map(ResponseEntity :: ok)
    .orElse(ResponseEntity.notFound().build());
}
}
