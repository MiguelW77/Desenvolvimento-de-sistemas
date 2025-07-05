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

import com.rhtec.api.repository.rhtecFuncionariosRepository;
import com.rhtec.api.model.rhtecFuncionariosModel;

@Service
public class rhtecFuncionariosServices {

    @Autowired
    rhtecFuncionariosRepository funcionariosRepository;
    
//get
    public List<rhtecFuncionariosModel> listarFuncionarios(){
        return funcionariosRepository.findAll();
    }

//get ID
    public Optional<rhtecFuncionariosModel> listarFuncionariosID(Long id){
        return funcionariosRepository.findById(id);
}

//delete ID 
public void deletarporID(Long id){
      funcionariosRepository.deleteById(id);
}
@PostMapping
public ResponseEntity<rhtecFuncionariosModel> cadastrarFuncionario(@RequestBody rhtecFuncionariosModel funcionario){
    rhtecFuncionariosModel funcionarioSalvo = funcionariosRepository.save(funcionario);
    return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioSalvo);
    
}
@PutMapping("/{id}")
public ResponseEntity<?> atualizarFuncionario(@PathVariable Long id , @RequestBody rhtecFuncionariosModel dadosAtt){
    Optional<rhtecFuncionariosModel> funcionarioJaSalvo = funcionariosRepository.findById(id);

    if(funcionarioJaSalvo.isPresent()){
        rhtecFuncionariosModel funcionarioNovo = funcionarioJaSalvo.get();

        funcionarioNovo.setId(dadosAtt.getId());
        funcionarioNovo.setNome((dadosAtt.getNome()));
        funcionarioNovo.setEmail(dadosAtt.getEmail());
        funcionarioNovo.setBairro(dadosAtt.getBairro());
        funcionarioNovo.setCEP(dadosAtt.getCEP());
        funcionarioNovo.setEndereco(dadosAtt.getEndereco());
        funcionarioNovo.setSenha(dadosAtt.getSenha());
        funcionarioNovo.setBairro(dadosAtt.getBairro());

        rhtecFuncionariosModel funcionarioAtualizado = funcionariosRepository.save(funcionarioNovo);

        return ResponseEntity.ok(funcionarioAtualizado);
       } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario não encontrado!");
       }
   
}






}
