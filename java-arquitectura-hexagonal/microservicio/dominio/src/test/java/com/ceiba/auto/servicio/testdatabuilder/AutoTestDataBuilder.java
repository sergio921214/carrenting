package com.ceiba.auto.servicio.testdatabuilder;

import com.ceiba.auto.modelo.entidad.Auto;



public class AutoTestDataBuilder {

    private Long id;
    private String placa;
    private String tipoCombustible;
    private Boolean rentado;

    public AutoTestDataBuilder() {
        placa = "abc123";
        tipoCombustible = "gas";
        rentado = false;
    }

    public AutoTestDataBuilder conPlaca(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
        return this;
    }

    public AutoTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public Auto build() {
        return new Auto(id,placa, tipoCombustible,rentado);
    }
}
