package com.losguachines.dto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author j1
 */
public class Mesa {
    private int idMesa;
    private int numPersonas;
    private boolean ocupado;
    
    public Mesa () {}

    public Mesa(int idMesa, int numPersonas, boolean ocupado) {
        this.idMesa = idMesa;
        this.numPersonas = numPersonas;
        this.ocupado = ocupado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
}
