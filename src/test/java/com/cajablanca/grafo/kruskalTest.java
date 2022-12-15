package com.cajablanca.grafo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class kruskalTest {

    private Grafo grafo;
    private Grafo gVacio;

    /**
     * grafo:
     *   1 ----- 2
     *   | \   / |
     *   |   X   |
     *   | /   \ |
     *   4 ----- 3
     */

    @BeforeEach
    public void setUp() {
        grafo = new Grafo();
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(5);
        Arco arco1 = new Arco(1, 2, 10);
        Arco arco2 = new Arco(2, 3, 9);
        Arco arco3 = new Arco(3, 5, 8);
        Arco arco4 = new Arco(1, 5, 7);
        Arco arco5 = new Arco(1, 3, 6);
        Arco arco6 = new Arco(2, 5, 15);
        grafo.addArco(arco1);
        grafo.addArco(arco2);
        grafo.addArco(arco3);
        grafo.addArco(arco4);
        grafo.addArco(arco5);
        grafo.addArco(arco6);

        gVacio = new Grafo();
    }

    @Test
    public void grafoVacio() {
        Grafo aux;
        aux = gVacio.kruskal();
        System.out.println("aux: ");
        aux.printGraph();
    }

    @Test
    public void noAdyacentes() {
        Grafo aux;
        gVacio.addVertice(1);
        aux = gVacio.kruskal();
        System.out.println("aux: ");
        aux.printGraph();
    }


    @Test
    public void nodoNoConectado() {  // bucle infinito
        Grafo aux;
        grafo.addVertice(5);
        aux = grafo.kruskal();
        System.out.println("aux: ");
        aux.printGraph();
    }

    @Test
    public void grafoOK() {
        System.out.println("sdfghj");
        Grafo aux;
        aux = grafo.kruskal();
        System.out.println("dfghjknbvcvbn");
        System.out.println("aux: ");
        aux.printGraph();
    }
}

