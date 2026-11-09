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
    List<Lugar> nodos = new ArrayList<>();
    public void addNode(Lugar nodo) {
        nodos.add(nodo);
        
    }
    public void dijkstra(Lugar inicio, Lugar fin) {
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
            return;
        }
        
        // REconstruccion del camino
        Stack<Lugar> camino = new Stack<>();
        Lugar actual = fin;
        
        while(actual != null) {
            camino.push(actual);
            actual = actual.previo;
            
        }
        System.out.println("Mas corto");
        while(!camino.isEmpty()) {
            System.out.println(camino.pop());
            if(!camino.isEmpty()) {
                System.out.println("->");
            }
        }
        System.out.println("\ndistancia total " + fin.distancia);
        
    }
    
    
}
