package com.example.ControleEstoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ControleEstoque.model.UsuarioModel;
import com.example.ControleEstoque.services.UsuarioService;

@RestController

@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioservico;

    @GetMapping
    public List<UsuarioModel>ListarTodos(){
        return usuarioservico.ListarTodos();
    }
@GetMapping("/{id}")
public ResponseEntity<UsuarioModel> buscarporId(@PathVariable Integer id){
    return usuarioservico.buscarporId(id)
    .map(ResponseEntity :: ok)
    .orElse(ResponseEntity.notFound().build());
}
    

}
