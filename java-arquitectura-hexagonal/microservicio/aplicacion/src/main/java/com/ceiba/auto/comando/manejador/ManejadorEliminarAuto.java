package com.ceiba.auto.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.auto.servicio.ServicioEliminarAuto;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarAuto implements ManejadorComando<Long> {

    private final ServicioEliminarAuto servicioEliminarAuto;

    public ManejadorEliminarAuto(ServicioEliminarAuto servicioEliminarAuto) {
        this.servicioEliminarAuto = servicioEliminarAuto;
    }

    public void ejecutar(Long idAuto) {
        this.servicioEliminarAuto.ejecutar(idAuto);
    }
}