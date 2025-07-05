package com.rhtec.api.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "funcionarios")
@Getter
@Setter
public class rhtecFuncionariosModel {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String Nome;
    @Column(nullable=false,unique=true)
    private String email;
    @Column(nullable=false)
    private String Senha;
    @Column(nullable=false , length=8)
    private String CEP;
    @Column(nullable=false)
    private String endereco;
    @Column(nullable=false)
    private String numero;
    @Column(nullable=false)
    private String Bairro;
    @Column(nullable=false)
    private String Cidade;
    @Column(nullable = false)
    private String Estado;

     @OneToMany(mappedBy = "funcionarioKey")
    private List<rhtecFuncionariosCargosModel> cargoFuncionarios;




}
