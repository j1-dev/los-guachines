/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.losguachines.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author j1
 */
public class Comanda {
    private int idComanda;
    private ArrayList<Producto> listaProductos;
    private Mesa mesa;
    private LocalDateTime fecha;
    private String observaciones;
    
    public Comanda () {}

    public Comanda(int idComanda, ArrayList<Producto> listaProductas, Mesa mesa, LocalDateTime fecha, String observaciones) {
        this.idComanda = idComanda;
        this.listaProductos = listaProductas;
        this.mesa = mesa;
        this.fecha = fecha;
        this.observaciones = observaciones;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductas) {
        this.listaProductos = listaProductas;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
    public float getTotal() {
        float total = 0f;
        
        for (int i = 0; i < listaProductos.size(); i++) {
            total += listaProductos.get(i).getPrecio();
        }
        
        return total;
    }
}
