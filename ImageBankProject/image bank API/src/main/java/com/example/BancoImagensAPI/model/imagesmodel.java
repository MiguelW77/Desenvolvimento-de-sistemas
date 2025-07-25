    package com.example.BancoImagensAPI.model;
    import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

    @Data
    @Entity
    @Table(name = "imagens")
    @Getter
    @Setter
    public class imagesmodel {
        public imagesmodel(){
            
        }

        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String nome;

        @Column
        private String url;
    }
