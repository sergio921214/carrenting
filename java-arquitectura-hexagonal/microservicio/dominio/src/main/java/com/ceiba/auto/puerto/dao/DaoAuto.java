package com.ceiba.auto.puerto.dao;

import com.ceiba.auto.modelo.dto.DtoAuto;

import java.util.List;

public interface DaoAuto {
	
	/**
     * Permite listar todos los autos
     * @return los autos
     */
    List<DtoAuto> listar();
    
    /**
     * Permite listar autos disponibles
     */
    List<DtoAuto> listarAutosDisponibles(Boolean rentado);
    
    /**
     * Permite listar autos rentados
     */
    List<DtoAuto> listarAutosRentados();

}
