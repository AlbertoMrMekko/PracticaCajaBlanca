package com.cajablanca.grafo;

import org.junit.jupiter.api.*;

class printListaAdyacenteTest {

    private Grafo grafo;
    private Grafo grafoV;

    @BeforeEach
    void setUp(){
        grafo = new Grafo();
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        grafo.addVertice(5);
        Arco a1 = new Arco(1,2,10);
        Arco a2 = new Arco(2,3,8);
        Arco a3 = new Arco(2,5,5);
        Arco a4 = new Arco(3,4,10);
        Arco a5 = new Arco(4,5,3);
        grafo.addArco(a1);
        grafo.addArco(a2);
        grafo.addArco(a3);
        grafo.addArco(a4);
        grafo.addArco(a5);
        grafoV = new Grafo();

    }

    @Test
    void soloVerticeOK() {
        grafoV.addVertice(2);
        grafoV.printListaAdyacentes(2);

    }

    @Test
    void grafoCompletoOK() {
        grafo.printListaAdyacentes(3);
    }
}

