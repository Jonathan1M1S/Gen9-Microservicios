package com.morales.camiones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morales.camiones.models.Camion;

public interface ICamionesDao extends JpaRepository<Camion, Long>{  

}
