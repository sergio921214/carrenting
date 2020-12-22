package com.ceiba.auto.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.auto.modelo.entidad.Auto;
import com.ceiba.auto.servicio.ServicioIngresarAuto;
import org.springframework.stereotype.Component;

import com.ceiba.auto.comando.ComandoAuto;
import com.ceiba.auto.comando.fabrica.FabricaAuto;

@Component
public class ManejadorIngresarAuto implements ManejadorComandoRespuesta<ComandoAuto, ComandoRespuesta<Long>> {

    private final FabricaAuto fabricaAuto;
    private final ServicioIngresarAuto servicioIngresarAuto;

    public ManejadorIngresarAuto(FabricaAuto fabricaAuto, ServicioIngresarAuto servicioIngresarAuto) {
        this.fabricaAuto = fabricaAuto;
        this.servicioIngresarAuto = servicioIngresarAuto;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoAuto comandoAuto) {
    	Auto auto = this.fabricaAuto.crear(comandoAuto);
        return new ComandoRespuesta<>(this.servicioIngresarAuto.ejecutar(auto));
    }
}
