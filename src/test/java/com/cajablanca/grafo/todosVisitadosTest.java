package com.cajablanca.grafo;

import org.junit.jupiter.api.*;

public class todosVisitadosTest {

    private Grafo grafo;
    private Grafo gVacio;

    @BeforeEach
    public void setUp() {
        grafo = new Grafo();
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        Arco arco1 = new Arco(1, 2, 10);
        Arco arco2 = new Arco(2, 3, 9);
        Arco arco3 = new Arco(3, 4, 8);
        Arco arco4 = new Arco(1, 4, 7);
        Arco arco5 = new Arco(1, 3, 6);
        Arco arco6 = new Arco(2, 4, 15);
        grafo.addArco(arco1);
        grafo.addArco(arco2);
        grafo.addArco(arco3);
        grafo.addArco(arco4);
        grafo.addArco(arco5);
        grafo.addArco(arco6);

        gVacio = new Grafo();
    }

    @Test
    public void todosVisitadosTrueOK() {
        grafo.componentsRelated();
    }

    @Test
    public void todosVisitadosFalseOK() {
        gVacio.componentsRelated();
    }

}
