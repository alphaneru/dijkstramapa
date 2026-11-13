/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dijsktramapa.service;

import java.util.*;

/**
 *
 * @author alexis
 */
public class Grafo {
    public List<Lugar> nodos = new ArrayList<>();
    
    
    public void addNode(Lugar nodo) {
        nodos.add(nodo);
        
    }
    
    public void addAristaNoDirigida(Lugar a, Lugar b, double peso) {
        a.addArista(b, peso);
        b.addArista(a, peso);
    }
    
    //para sacar el nodo dado el nombre del combobox
    public Lugar buscarNodo(String nombre) {
        System.out.println("se ejecuto buscarnodo");
        
        for(Lugar nodo : nodos) {
           // System.out.println("hola hola " + nombre + " " + nodo.nombre);
            if(nodo.nombre.equals(nombre)) {
                return nodo;
            }
        }
        return null;
    }
    
    // es de tipo de dato Map.Entry pa que devuelva la lista de la ruta y la distancua
    public Map.Entry<List<Lugar>, Double> dijkstra(String inicioNombre, String finNombre) {
        
        Lugar inicio = buscarNodo(inicioNombre);
        Lugar fin = buscarNodo(finNombre);
        
        
        //inicializar
        for(Lugar nodo : nodos) {
            nodo.distancia = Integer.MAX_VALUE;
            nodo.previo = null;
        }
        inicio.distancia = 0;
       
        PriorityQueue<Lugar> pq = new PriorityQueue<>(Comparator.comparingDouble(n -> n.distancia));
        pq.add(inicio);
        
        while(!pq.isEmpty()) {
            Lugar actual = pq.poll();
            
            if(actual == fin) {
                break;
            }
            
            // Checando sus vecinos
            for(Arista arista : actual.aristas) {
                Lugar vecino = arista.destino;
                double nuevaDistancia = actual.distancia + arista.peso;
               
                // para ver si se encontro un camino mas corto
                if(nuevaDistancia < vecino.distancia) {
                    vecino.distancia = nuevaDistancia;
                    vecino.previo = actual;
                    pq.add(vecino);
                }
            }
            
        }
        if(fin.distancia == Double.MAX_VALUE) {
            System.out.println("No hay camino");
            return null;
        }
        
        // REconstruccion del camino
        Stack<Lugar> camino = new Stack<>();
        Lugar actual = fin;
        
        while(actual != null) {
            camino.push(actual);
            actual = actual.previo;
            
        }
        System.out.println("Mas corto");
        List<Lugar> ruta = new ArrayList<>();
        
        while(!camino.isEmpty()) {
            ruta.add(camino.pop());
            
            //if(!camino.isEmpty()) {
              //  System.out.println("->");
            //}
        }
        
        Map.Entry<List<Lugar>, Double> p = Map.entry(ruta, fin.distancia);
        
        return p;
        
        
       // System.out.println("\ndistancia total " + fin.distancia);
       
        
    }
    
    
}
