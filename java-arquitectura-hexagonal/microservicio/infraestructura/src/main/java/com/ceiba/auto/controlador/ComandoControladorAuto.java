package com.ceiba.auto.controlador;


import com.ceiba.ComandoRespuesta;
import com.ceiba.auto.comando.ComandoAuto;
import com.ceiba.auto.comando.manejador.ManejadorActualizarAuto;
import com.ceiba.auto.comando.manejador.ManejadorIngresarAuto;
import com.ceiba.auto.comando.manejador.ManejadorEliminarAuto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/auto")
@Api(tags = { "Controlador comando auto"})
public class ComandoControladorAuto {

    private final ManejadorIngresarAuto manejadorIngresarAuto;
	private final ManejadorEliminarAuto manejadorEliminarAuto;
	private final ManejadorActualizarAuto manejadorActualizarAuto;

    @Autowired
    public ComandoControladorAuto(ManejadorIngresarAuto manejadorIngresarAuto,
    								ManejadorEliminarAuto manejadorEliminarAuto,
    								ManejadorActualizarAuto manejadorActualizarAuto) {
        this.manejadorIngresarAuto = manejadorIngresarAuto;
		this.manejadorEliminarAuto = manejadorEliminarAuto;
		this.manejadorActualizarAuto = manejadorActualizarAuto;
    }

    @PostMapping
    @ApiOperation("Ingresar Auto")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoAuto comandoAuto) {
        return manejadorIngresarAuto.ejecutar(comandoAuto);
    }

    @DeleteMapping(value="/{id}")
	@ApiOperation("Eliminar Auto")
	public void eliminar(@PathVariable Long id) {
    	manejadorEliminarAuto.ejecutar(id);
	}

	@PutMapping(value="/{id}")
	@ApiOperation("Actualizar Usuario")
	public void actualizar(@RequestBody ComandoAuto comandoAuto,@PathVariable Long id) {
		comandoAuto.setId(id);
		manejadorActualizarAuto.ejecutar(comandoAuto);
	}
}

