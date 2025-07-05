package com.rhtec.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhtec.api.model.rhtecCargosModel;


@Repository
public interface rhtecCargosRepository extends JpaRepository<rhtecCargosModel, Long> {

}
