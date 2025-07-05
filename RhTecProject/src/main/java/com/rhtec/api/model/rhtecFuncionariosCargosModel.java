package com.rhtec.api.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "funcionario_por_cargo")
@Getter
@Setter
public class rhtecFuncionariosCargosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "funcionario_id", nullable = false)
    private rhtecFuncionariosModel funcionarioKey;

    @ManyToOne
    @JoinColumn(name = "cargo_id", nullable = false)
    private rhtecCargosModel cargoKey;

    @Column(nullable = false)
    private String detalhes;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;



    

}
