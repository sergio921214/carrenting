package com.ceiba.auto.controlador;

import java.util.List;

import com.ceiba.auto.consulta.ManejadorListarAutos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.auto.modelo.dto.DtoAuto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/auto")
@Api(tags={"Controlador consulta auto"})
public class ConsultaControladorAuto {

    private final ManejadorListarAutos manejadorListarAutos;

    public ConsultaControladorAuto(ManejadorListarAutos manejadorListarAutos) {
        this.manejadorListarAutos = manejadorListarAutos;
    }

    @GetMapping
    @ApiOperation("Listar Autos")
    public List<DtoAuto> listar() {
        return this.manejadorListarAutos.ejecutar();
    }

}
