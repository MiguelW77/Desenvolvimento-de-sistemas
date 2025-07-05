package com.rhtec.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhtec.api.model.rhtecFuncionariosModel;


@Repository
public interface rhtecFuncionariosRepository extends JpaRepository<rhtecFuncionariosModel, Long> {

}
