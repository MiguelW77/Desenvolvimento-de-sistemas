package com.example.ControleEstoque.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControleEstoque.model.UsuarioModel;
import com.example.ControleEstoque.repository.UsuarioRepository;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repositorioUsuario;
    
    public List<UsuarioModel> ListarTodos(){
    return repositorioUsuario.findAll();
}
public Optional<UsuarioModel>buscarporId(Integer id){
    return repositorioUsuario.findById(id);
}

}
