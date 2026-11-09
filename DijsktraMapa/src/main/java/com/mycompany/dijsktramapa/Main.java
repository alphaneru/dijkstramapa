/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dijsktramapa;

import com.mycompany.dijsktramapa.service.Grafo;
import com.mycompany.dijsktramapa.service.Lugar;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexis
 */
public class Main {

    public List<Lugar> dijkstraTest() {
        
        Grafo g = new Grafo();
        Lugar l1 = new Lugar("nodo1", 60, 240);
        Lugar l2 = new Lugar("nodo2", 210, 300);
        Lugar l3 = new Lugar("nodo3", 300, 430);
        Lugar l4 = new Lugar("nodo4", 380, 250);
        Lugar l5 = new Lugar("nodo5", 480, 380);
        
        g.addNode(l1);
        g.addNode(l2);
        g.addNode(l3);
        g.addNode(l4);
        g.addNode(l5);
        
        l1.addArista(l2, 300.5);
        l1.addArista(l3, 250.1);
        l2.addArista(l4, 20.5);
        l4.addArista(l3, 70.9);
        l5.addArista(l3, 780.3);
        
        List<Lugar> listaTest = new ArrayList<>();
        listaTest.add(l1);
        listaTest.add(l2);
        listaTest.add(l3);
        listaTest.add(l4);
        listaTest.add(l5);
        
        //g.dijkstra(l3, l5);
        return listaTest;
        
    }
}
