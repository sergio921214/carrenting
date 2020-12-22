package com.ceiba.auto.servicio;

import com.ceiba.auto.puerto.repositorio.RepositorioAuto;

public class ServicioEliminarAuto {

    private final RepositorioAuto repositorioAuto;

    public ServicioEliminarAuto(RepositorioAuto repositorioAuto) {
        this.repositorioAuto = repositorioAuto;
    }

    public void ejecutar(Long id) {
        this.repositorioAuto.eliminar(id);
    }
}