package com.rhtec.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rhtec.api.model.rhtecFuncionariosCargosModel;
import com.rhtec.api.repository.rhtecFuncionariosCargosRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class rhtecFuncionariosCargosServices {
    
     private final rhtecFuncionariosCargosRepository repository;

    public rhtecFuncionariosCargosModel save(rhtecFuncionariosCargosModel vinculo) {
        return repository.save(vinculo);
    }

    public List<rhtecFuncionariosCargosModel> findAll() {
        return repository.findAll();
    }

    public Optional<rhtecFuncionariosCargosModel> findById(int id) {
        return repository.findById(id);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public List<rhtecFuncionariosCargosModel> findByCargoId(Long cargoId) {
        return repository.findByCargoKeyId(cargoId);
    }

    public List<rhtecFuncionariosCargosModel> findByFuncionarioId(Long funcionarioId) {
        return repository.findByFuncionarioKeyId(funcionarioId);
    }
}


