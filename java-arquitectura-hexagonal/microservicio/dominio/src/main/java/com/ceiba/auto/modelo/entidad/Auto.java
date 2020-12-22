package com.ceiba.auto.modelo.entidad;

import lombok.Getter;

import static com.ceiba.dominio.ValidadorArgumento.validarLongitud;
import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Auto {

    private static final String SE_DEBE_INGRESAR_LA_PLACA = "Se debe ingresar la placa";
    private static final String LA_PLACA_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A = "La PLACA debe tener una longitud mayor o igual a %s";
    private static final String SE_DEBE_INGRESAR_TIPO_COMBUSTIBLE = "Se debe ingresar el tipo de combustible";


    private static final int LONGITUD_MINIMA_PLACA = 6;

    private Long id;
    private String placa;
    private String tipoCombustible;
    private Boolean rentado;

    public Auto(Long id,String placa, String tipoCombustible,Boolean rentado) {
        validarObligatorio(placa, SE_DEBE_INGRESAR_LA_PLACA);
        validarObligatorio(tipoCombustible, SE_DEBE_INGRESAR_TIPO_COMBUSTIBLE);
        validarLongitud(placa, LONGITUD_MINIMA_PLACA, String.format(LA_PLACA_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A,LONGITUD_MINIMA_PLACA));


        this.id = id;
        this.placa = placa;
        this.tipoCombustible = tipoCombustible;
        this.rentado = rentado;
    }

}