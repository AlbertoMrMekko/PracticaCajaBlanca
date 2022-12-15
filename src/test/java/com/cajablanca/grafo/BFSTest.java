package com.cajablanca.grafo;

import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class BFSTest {

    private Grafo grafo;
    private Grafo gVacio;

    @BeforeEach
    public void setUp() {
        grafo = new Grafo();
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        Arco a1 = new Arco(1, 2, 10);
        Arco a2 = new Arco(2, 3, 10);
        Arco a3 = new Arco(3, 4, 10);
        grafo.addArco(a1);
        grafo.addArco(a2);
        grafo.addArco(a3);

        gVacio = new Grafo();
    }

    @Test
    public void noExisteVertice() {
        assertThrows(NoSuchElementException.class, () -> grafo.BFS(10));
    }

    @Test
    public void noAdyacentes() {
        gVacio.addVertice(1);
        assertEquals("[1]", gVacio.BFS(1));
    }

    @Test
    public void siAdyacentes() {
        assertEquals("[1 2 3 4]", grafo.BFS(1));
    }
}
