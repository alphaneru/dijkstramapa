/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dijsktramapa.service;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alexis
 */
public class Lugar {
    String nombre;
    List<Arista> aristas;
    double distancia;
    Lugar previo;
    //coordenadas
    public final int x, y;
    
    public Lugar(String nombre, int x, int y) {
        this.nombre = nombre;
        this.aristas = new ArrayList<>();
        this.x = x;
        this.y = y;
    }
    public void addArista(Lugar destino, double peso) {
        aristas.add(new Arista(destino, peso));
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
