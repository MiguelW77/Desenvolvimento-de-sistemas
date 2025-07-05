package com.rhtec.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhtec.api.model.rhtecCargosModel;
import com.rhtec.api.services.rhtecCargosServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/rhteccargos")
public class rhtecCargosController {

    @Autowired
    rhtecCargosServices servicesCargos;


    @GetMapping
    public List<rhtecCargosModel> listarCargos() {
        return servicesCargos.listarCargos();

    }
    @GetMapping("/{id}")
    public Optional<rhtecCargosModel> listarCargodID(Long id){
        return servicesCargos.listarCargosID(id);
    }
    @PostMapping
    public ResponseEntity<rhtecCargosModel> cadastroCargo(@RequestBody rhtecCargosModel cargo){
        return servicesCargos.cadastrarCargo(cargo);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizacaoCargo(@PathVariable Long id, @RequestBody rhtecCargosModel cargos) {
       return servicesCargos.atualizarCargo(id, cargos);
    }
    
    }
    

    
    


