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

    private void addAristaNoDirigida(Lugar a, Lugar b, double peso) {
        a.addArista(b, peso);
        b.addArista(a, peso);
    }

    public List<Lugar> dijkstraTest() {
        
        Grafo g = new Grafo();

        Lugar entrada = new Lugar("entrada", 520, 144);
        Lugar biblioteca = new Lugar("biblioteca", 400, 213);
        Lugar casetaEstacionamiento  = new Lugar("casetaEstacionamiento", 733, 201);
        Lugar estacionamiento =  new Lugar("estacionamiento", 924, 309);
        Lugar auditorioVinculacion = new  Lugar("auditorioVinculacion", 166, 289);
        Lugar direccion = new Lugar("direccion", 201, 304);
        Lugar vinculacion = new Lugar("vinculacion", 206, 334);
        Lugar palapas = new Lugar("palapas", 383, 337);
        Lugar cocinasGastronomia =  new Lugar("cocinasGastronomia", 169, 379);
        Lugar edificioA =  new Lugar("edificioA", 457, 431);
        Lugar edificioB =  new Lugar("edificioB", 656, 483);
        Lugar cabaniaGastro = new Lugar("cabaniaGastro", 167, 454);
        Lugar canchaFutbol = new Lugar("canchaFutbol", 879, 631);
        Lugar edificioE = new Lugar("edificioE", 376, 616);
        Lugar edificioTics = new Lugar("edificioTics", 581, 644);
        Lugar auditorioAbandonado = new Lugar("auditorioAbandonado", 190, 640);
        Lugar canchaBasquet =  new Lugar("canchaBasquet", 249, 703);
        Lugar cafeteria =  new Lugar("cafeteria", 444, 717);
        
        g.addNode(entrada);
        g.addNode(biblioteca);
        g.addNode(casetaEstacionamiento);
        g.addNode(estacionamiento);
        g.addNode(auditorioVinculacion);
        g.addNode(direccion);
        g.addNode(vinculacion);
        g.addNode(palapas);
        g.addNode(cocinasGastronomia);
        g.addNode(edificioA);
        g.addNode(edificioB);
        g.addNode(cabaniaGastro);
        g.addNode(canchaFutbol);
        g.addNode(edificioE);
        g.addNode(edificioTics);
        g.addNode(auditorioAbandonado);
        g.addNode(canchaBasquet);
        g.addNode(cafeteria);

        addAristaNoDirigida(entrada, biblioteca, 35.6);
        addAristaNoDirigida(entrada, edificioA, 93.2);
        addAristaNoDirigida(entrada, edificioB, 113.0);
        addAristaNoDirigida(entrada, casetaEstacionamiento, 70.3);
        addAristaNoDirigida(biblioteca, auditorioVinculacion, 91.2);
        addAristaNoDirigida(biblioteca, palapas, 43.4);
        addAristaNoDirigida(casetaEstacionamiento, edificioB, 91.7);
        addAristaNoDirigida(casetaEstacionamiento, estacionamiento, 53.0);
        addAristaNoDirigida(estacionamiento, edificioB, 92.2);
        addAristaNoDirigida(estacionamiento, canchaFutbol, 108.0);
        addAristaNoDirigida(auditorioVinculacion, vinculacion, 20.0);
        addAristaNoDirigida(direccion, vinculacion, 5.89);
        addAristaNoDirigida(vinculacion, palapas, 59.7);
        addAristaNoDirigida(vinculacion, cocinasGastronomia, 21.2);
        addAristaNoDirigida(palapas, edificioA, 38.7);
        addAristaNoDirigida(cocinasGastronomia, cabaniaGastro, 26.0);
        addAristaNoDirigida(edificioA, cabaniaGastro, 94.8);
        addAristaNoDirigida(edificioA, auditorioAbandonado, 108.0);
        addAristaNoDirigida(edificioA, edificioE, 64.8);
        addAristaNoDirigida(edificioA, edificioB, 62.4);
        addAristaNoDirigida(edificioB, edificioE, 95.0);
        addAristaNoDirigida(edificioB, edificioTics, 59.5);
        addAristaNoDirigida(edificioB, canchaFutbol, 95.5);
        addAristaNoDirigida(cabaniaGastro, auditorioAbandonado, 60.5);
        addAristaNoDirigida(canchaFutbol, edificioTics, 99.7);
        addAristaNoDirigida(edificioE, edificioTics, 69.1);
        addAristaNoDirigida(edificioE, cafeteria, 41.2);
        addAristaNoDirigida(edificioE, canchaBasquet, 50.8);
        addAristaNoDirigida(edificioE, auditorioAbandonado, 60.7);
        addAristaNoDirigida(edificioTics, cafeteria, 51.4);
        addAristaNoDirigida(auditorioAbandonado, canchaBasquet, 26.8);
        
        List<Lugar> listaTest = new ArrayList<>();
        listaTest.add(entrada);
        listaTest.add(biblioteca);
        listaTest.add(casetaEstacionamiento);
        listaTest.add(estacionamiento);
        listaTest.add(auditorioVinculacion);
        listaTest.add(direccion);
        listaTest.add(vinculacion);
        listaTest.add(palapas);
        listaTest.add(cocinasGastronomia);
        listaTest.add(edificioA);
        listaTest.add(edificioB);
        listaTest.add(cabaniaGastro);
        listaTest.add(canchaFutbol);
        listaTest.add(edificioE);
        listaTest.add(edificioTics);
        listaTest.add(auditorioAbandonado);
        listaTest.add(canchaBasquet);
        listaTest.add(cafeteria);

        
        //g.dijkstra(l3, l5);
        return listaTest;
        
    }
}
