package com.example.ControleEstoque.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;





@Entity
@Table(name = "produtos")
@Getter
@Setter

public class ProdutosModel {
    


        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;

        @Column(nullable=false)
        private String nome;

        @Column(nullable=false)
        private Long quantidade;

        @Column(length=20)
        private String status_produto;

      
    }



