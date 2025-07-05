package com.rhtec.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rhtec.api.model.rhtecFuncionariosCargosModel;
import com.rhtec.api.services.rhtecFuncionariosCargosServices;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/funcinarios-cargos")
public class rhtecFuncionariosCargosController {
    
        public rhtecFuncionariosCargosController(rhtecFuncionariosCargosServices service) {
            this.service = service;
    }      
    @Autowired
        private final rhtecFuncionariosCargosServices service;
        
    @PostMapping 
        public ResponseEntity<rhtecFuncionariosCargosModel> criarVinculo(@RequestBody rhtecFuncionariosCargosModel vinculo){
            rhtecFuncionariosCargosModel vinculoCriado = service.save(vinculo);
            return new ResponseEntity<>(vinculoCriado, HttpStatus.CREATED);
        }
    
    @GetMapping 
        public ResponseEntity<?> listarVinculos(@RequestParam (required = false) Long cargoId, @RequestParam(required=false) Long funcionarioId ){
            if(cargoId != null){
                return ResponseEntity.ok(service.findByCargoId(cargoId));
        } else if (funcionarioId != null) {
            return ResponseEntity.ok(service.findByFuncionarioId(funcionarioId));
        } else{
            return ResponseEntity.ok(service.findAll());
        }
        }

    @GetMapping("{/id}")
        public ResponseEntity<rhtecFuncionariosCargosModel> getID(@PathVariable int id){
        Optional<rhtecFuncionariosCargosModel> vinculo = service.findById(id);
        return vinculo.map(ResponseEntity :: ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @PutMapping("{/id}")
        public ResponseEntity<rhtecFuncionariosCargosModel> atualizar(@PathVariable int id, @RequestBody rhtecFuncionariosCargosModel vinculo){
        Optional<rhtecFuncionariosCargosModel> vinculoExistente = service.findById(id);
        if(vinculoExistente.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        vinculo.setId(id);
        rhtecFuncionariosCargosModel vinculoAtualizado = service.save(vinculo);
        return ResponseEntity.ok(vinculoAtualizado);
            
        }
    @DeleteMapping("{/id}")
        public ResponseEntity<Void> deletar(@PathVariable int id){
        Optional<rhtecFuncionariosCargosModel> vinculoExistente = service.findById(id);
        if(vinculoExistente.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
        }
    


    
   




}
