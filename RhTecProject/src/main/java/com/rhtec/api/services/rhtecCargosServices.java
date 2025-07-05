package com.rhtec.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rhtec.api.model.rhtecCargosModel;
import com.rhtec.api.repository.rhtecCargosRepository;

@Service
public class rhtecCargosServices {


    @Autowired
    rhtecCargosRepository cargosRepository;

    //get
    public List<rhtecCargosModel> listarCargos(){
         return cargosRepository.findAll();
    }

    //get ID
    public Optional<rhtecCargosModel> listarCargosID(Long id ){
        return cargosRepository.findById(id);
    }
    //delete ID
    public void deletarporID(Long id){
        cargosRepository.deleteById(id);
    }
    @PostMapping
    public ResponseEntity<rhtecCargosModel> cadastrarCargo(@RequestBody rhtecCargosModel cargo){
        rhtecCargosModel cargoSalvo = cargosRepository.save(cargo);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargoSalvo);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarCargo(@PathVariable Long id, @RequestBody rhtecCargosModel cargos){
        Optional<rhtecCargosModel> cargoExistente = cargosRepository.findById(id);

        if(cargoExistente.isPresent()){
            rhtecCargosModel cargoNovo = cargoExistente.get();

            cargoNovo.setId(cargos.getId());
            cargoNovo.setNome(cargos.getNome());
            cargoNovo.setDescricao(cargos.getDescricao());

            rhtecCargosModel cargoAtualizado = cargosRepository.save(cargoNovo);
        return ResponseEntity.ok(cargoAtualizado);
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cargo não encontrado!");

        }
    }

   


    



}
