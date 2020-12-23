package com.ceiba.auto.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoAuto{

    private Long id;//OJO que del front no viene el ID
    private String placa;
    private String tipoCombustible;
    private Boolean rentado;
}