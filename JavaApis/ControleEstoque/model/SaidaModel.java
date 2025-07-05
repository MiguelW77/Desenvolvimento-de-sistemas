package com.example.ControleEstoque.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="saida")

public class SaidaModel {

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private int id;


        @Column
        private java.time.LocalDateTime data_saida;
        

    @Column(nullable=false)
    private int id_usuario;

    @Column(nullable=false)
    private int id_produto;

    @Column(nullable=false, length=20)
    private Long quantidade_saida;

}
