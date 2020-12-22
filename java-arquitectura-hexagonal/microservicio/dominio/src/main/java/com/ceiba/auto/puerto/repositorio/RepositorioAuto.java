package com.ceiba.auto.puerto.repositorio;

import com.ceiba.auto.modelo.entidad.Auto;

public interface RepositorioAuto {

    /**
     * Permite ingresar un auto para la renta
     * @param auto
     * @return el id generado
     */
    Long ingresar(Auto auto);

    /**
     * Permite actualizar un auto
     * @param auto
     */
    void actualizar(Auto auto);

    /**
     * Permite eliminar un auto
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe un auto con una placa
     * @param placa
     * @return si existe o no
     */
    boolean existe(String placa);

    /**
     * Permite validar si existe un usuario con un nombre excluyendo un id
     * @param nombre
     * @return si existe o no
     */
    boolean existeExcluyendoId(Long id,String placa);

}
