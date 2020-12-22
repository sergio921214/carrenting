package com.ceiba.configuracion;

import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;

import com.ceiba.usuario.servicio.ServicioActualizarUsuario;
import com.ceiba.usuario.servicio.ServicioCrearUsuario;
import com.ceiba.usuario.servicio.ServicioEliminarUsuario;
import com.ceiba.auto.puerto.repositorio.RepositorioAuto;
import com.ceiba.auto.servicio.ServicioActualizarAuto;
import com.ceiba.auto.servicio.ServicioIngresarAuto;
import com.ceiba.auto.servicio.ServicioEliminarAuto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {
    @Bean
    public ServicioIngresarAuto servicioIngresarAuto(RepositorioAuto repositorioAuto) {
        return new ServicioIngresarAuto(repositorioAuto);
    }

    @Bean
    public ServicioActualizarAuto servicioActualizarAuto(RepositorioAuto repositorioAuto) {
        return new ServicioActualizarAuto(repositorioAuto);
    }
    
    @Bean
    public ServicioEliminarAuto servicioEliminarAuto(RepositorioAuto repositorioAuto) {
        return new ServicioEliminarAuto(repositorioAuto);
    }
    
    @Bean
    public ServicioCrearUsuario servicioCrearUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioCrearUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioEliminarUsuario servicioEliminarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioEliminarUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioActualizarUsuario servicioActualizarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioActualizarUsuario(repositorioUsuario);
    }
	

}
