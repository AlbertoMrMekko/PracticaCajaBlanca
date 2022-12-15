package com.cajablanca.editor;

import org.junit.jupiter.api.*;

public class sustituirPalabraTest {

    private Editor editor;

    @BeforeEach
    public void setUp() {
        editor = new Editor();
        editor.cargarEditor("ficheroEditor.txt");
    }

    @Test
    public void editorVacioOK() {
        editor.sustituirPalabra("hola", "adios");
    }

    @Test
    public void lineaVaciaOK() {
        editor.sustituirPalabra("hola", "adios");
    }

    @Test
    public void sustituirOK() {
        editor.sustituirPalabra("hola", "adios");
        if (editor.existePalabra("adios") && !editor.existePalabra("hola"))
            System.out.println("OK");
        else
            System.out.println("NO OK");
    }
    /**
     * Contenido fichero:
     * hola A
     * A hola
     */
}
