package com.ceiba.auto.servicio;

import com.ceiba.auto.modelo.entidad.Auto;
import com.ceiba.auto.puerto.repositorio.RepositorioAuto;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
import com.ceiba.auto.servicio.testdatabuilder.AutoTestDataBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import com.ceiba.BasePrueba;

public class ServicioIngresarAutoTest {

    @Test
    public void validarPlacaLongitudMenor6Test() {
        // arrange
    	AutoTestDataBuilder autoTestDataBuilder = new AutoTestDataBuilder().conPlaca("abc123");
        // act - assert
        BasePrueba.assertThrows(() -> autoTestDataBuilder.build(), ExcepcionLongitudValor.class, "La placa debe tener una longitud mayor o igual a 6");
    }

    @Test
    public void validarAutoExistenciaPreviaTest() {
        // arrange
        Auto auto = new AutoTestDataBuilder().build();
        RepositorioAuto repositorioAuto = Mockito.mock(RepositorioAuto.class);
        Mockito.when(repositorioAuto.existe(Mockito.anyString())).thenReturn(true);
        ServicioIngresarAuto servicioIngresarAuto = new ServicioIngresarAuto(repositorioAuto);
        // act - assert
        BasePrueba.assertThrows(() -> servicioIngresarAuto.ejecutar(auto), ExcepcionDuplicidad.class,"El auto ya existe en el sistema");
    }
}
