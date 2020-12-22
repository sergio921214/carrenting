package com.ceiba.auto.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.auto.modelo.entidad.Auto;
import com.ceiba.auto.puerto.repositorio.RepositorioAuto;

public class ServicioActualizarAuto {
	
	 private static final String EL_AUTO_YA_EXISTE_EN_EL_SISTEMA = "El auto ya existe en el sistema";

	    private final RepositorioAuto repositorioAuto;

	    public ServicioActualizarAuto(RepositorioAuto repositorioAuto) {
	        this.repositorioAuto = repositorioAuto;
	    }

	    public void ejecutar(Auto auto) {
	        validarExistenciaPrevia(auto);
	        this.repositorioAuto.actualizar(auto);
	    }

	    private void validarExistenciaPrevia(Auto auto) {
	        boolean existe = this.repositorioAuto.existeExcluyendoId(auto.getId(),auto.getPlaca());
	        if(existe) {
	            throw new ExcepcionDuplicidad(EL_AUTO_YA_EXISTE_EN_EL_SISTEMA);
	        }
	    }

}
