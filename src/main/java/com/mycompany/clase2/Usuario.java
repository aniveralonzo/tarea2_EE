/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase2;

import java.time.LocalDate;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

/**
 *
 * @author 50232
 */
public class Usuario {
    
    @NotNull(message="nombre no puede ser nulo")
    private String nombre;
    
    @NotNull(message="edad no puede ser nula")
    @Min(value=18,message="edad debe de ser mayor o igual a 18")
    @Max(value=150,message="edad debe ser menor de 150")
    private Integer edad;
    
    @Min(value =0,message="edad debe ser mayor o igual a zero")
    private int credito;
    
    @NotNull(message="nombre no puede ser nulo")    
    @Email(message="no es un email valido")
    private String email;
    
    @Past(message="fecha no valida")
    private LocalDate fecha;//en lugar de la clase Date

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    
}
