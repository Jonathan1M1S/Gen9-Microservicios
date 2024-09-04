package com.morales.rutas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morales.rutas.models.Ruta;

public interface IRutasDao extends JpaRepository<Ruta, Long>{

}
