package com.example.ControleEstoque.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="usuario")
public class UsuarioModel {
    
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private int id;

        @Column(nullable=false, length=20)
        private String nome;

    @Column(nullable=false, length=20)
    private String endereco;

    @Column(nullable=false, length=20)
    private String setor;


}
