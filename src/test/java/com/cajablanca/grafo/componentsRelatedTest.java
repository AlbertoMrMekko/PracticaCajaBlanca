package com.cajablanca.grafo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class componentsRelatedTest {

    private Grafo grafo;

    @BeforeEach
    public void setUp() {
        grafo = new Grafo();

    }

    @Test
    public void grafoVacioOK() {
        assertEquals("", grafo.componentsRelated());
    }

    @Test
    public void soloVerticeOK() {
        grafo.addVertice(1);
        assertEquals("[1]", grafo.componentsRelated());
    }

    @Test
    public void verticesNoConectadosOK() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        assertEquals("[1][2]", grafo.componentsRelated());
    }

    @Test
    public void verticesConectadosOK() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        Arco arco = new Arco(1, 2, 10);
        grafo.addArco(arco);
        assertEquals("[1 2]", grafo.componentsRelated());
    }

    @Test
    public void grafoCompletoOK() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        grafo.addVertice(5);
        Arco arco1 = new Arco(1, 2, 10);
        Arco arco2 = new Arco(2, 3, 10);
        Arco arco3 = new Arco(1, 4, 10);
        Arco arco4 = new Arco(4, 3, 10);
        Arco arco5 = new Arco(3, 5, 10);
        grafo.addArco(arco1);
        grafo.addArco(arco2);
        grafo.addArco(arco3);
        grafo.addArco(arco4);
        grafo.addArco(arco5);
        assertEquals("[1 2 4 3 5]", grafo.componentsRelated());
    }
}
