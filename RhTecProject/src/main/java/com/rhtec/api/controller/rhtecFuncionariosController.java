package com.rhtec.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhtec.api.model.rhtecFuncionariosModel;
import com.rhtec.api.services.rhtecFuncionariosServices;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/rhtecfuncionarios")
public class rhtecFuncionariosController {

    @Autowired
    rhtecFuncionariosServices funcionariosServices;

    @GetMapping
    public List<rhtecFuncionariosModel> listarFuncionarios(){
        return funcionariosServices.listarFuncionarios();
    }   
    
    @GetMapping("/{id}")
    public Optional<rhtecFuncionariosModel> listarFuncionariosID(@PathVariable Long id){
        return funcionariosServices.listarFuncionariosID(id);
    }

    @PostMapping
    public ResponseEntity<rhtecFuncionariosModel> cadastroFuncionario(@RequestBody rhtecFuncionariosModel funcionario){
        return funcionariosServices.cadastrarFuncionario(funcionario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizaFuncionario(@PathVariable Long id, @RequestBody rhtecFuncionariosModel dadosAtt){
        return funcionariosServices.atualizarFuncionario(id, dadosAtt);

    }
}
