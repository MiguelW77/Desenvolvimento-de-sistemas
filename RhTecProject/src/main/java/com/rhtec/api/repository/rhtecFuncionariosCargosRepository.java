package com.rhtec.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhtec.api.model.rhtecFuncionariosCargosModel;


@Repository
public interface rhtecFuncionariosCargosRepository extends JpaRepository<rhtecFuncionariosCargosModel, Integer> {
     List<rhtecFuncionariosCargosModel> findByCargoKeyId(Long cargoId);

    List<rhtecFuncionariosCargosModel> findByFuncionarioKeyId(Long funcionarioId);

}
