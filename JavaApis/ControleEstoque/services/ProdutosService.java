package com.example.ControleEstoque.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControleEstoque.model.ProdutosModel;
import com.example.ControleEstoque.repository.ProdutosRepository;




@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository repositorioProduto;

    //

    public List<ProdutosModel> listarTodos(){
        return repositorioProduto.findAll();
    }

    public Optional<ProdutosModel> buscarporId(Long id){
        return repositorioProduto.findById(id);
    }

    

}
