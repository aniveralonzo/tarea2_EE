/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase2;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

/**
 *
 * @author 50232
 */
public class Factura {
    @NotNull(message="nombre not null")
    @NotEmpty(message="nombre error")
    @Size(min=10,max=100)
    private String nombreFactura;
    
    @NotNull(message="direccion not null error")
    @NotEmpty(message="direccion not empty error")
    @Size(min=5,max=1000)
    private String direccion;
    
    @NotNull(message="nit not null error")
    @NotEmpty(message="nit not empty error")
    private String nit;//modulo11
    
    @NotNull(message="fecha not null error")
    @PastOrPresent(message="fecha past present null error")
    private LocalDate fechaFactura;
    
    @NotNull(message="monto total not null error")
    @DecimalMin(value="0.01",message="monto total  decimal min")
    private BigDecimal montoTotal;

    public String getNombreFactura() {
        return nombreFactura;
    }

    public void setNombreFactura(String nombreFactura) {
        this.nombreFactura = nombreFactura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
    
}
