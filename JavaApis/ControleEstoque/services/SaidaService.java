package com.example.ControleEstoque.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControleEstoque.model.SaidaModel;
import com.example.ControleEstoque.repository.SaidaRepository;


@Service
public class SaidaService {

    @Autowired
    private SaidaRepository repositorioSaida;


public List<SaidaModel> ListarTodos(){
    return repositorioSaida.findAll();
}

public Optional<SaidaModel>buscarporId(Integer id){
    return repositorioSaida.findById(id);
}
    

}
