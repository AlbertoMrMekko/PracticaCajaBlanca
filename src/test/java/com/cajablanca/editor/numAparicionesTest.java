package com.cajablanca.editor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class numAparicionesTest {

    private Editor editor;

    @BeforeEach
    public void setUp() {
        editor = new Editor();
    }

    @Test
    public void inicioMenorCeroKO() {
        editor.cargarEditor("ficheroEditor.txt");
        assertThrows(IllegalArgumentException.class, ()->
                editor.numApariciones(-1, 1, "hola"));
    }

    @Test
    public void finMayorLineasKO() {
        editor.cargarEditor("ficheroEditor.txt");
        assertThrows(IllegalArgumentException.class, ()->
                editor.numApariciones(1, 2, "hola"));
    }

    @Test
    public void editorVacioOK(){
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals(0,  editor.numApariciones(1,0,"hola"));
    }

    @Test
    public void inicioMayorFinOK() {
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals(0, editor.numApariciones(3, 0, "hola"));
    }

    @Test
    public void noEncuentraOK() {
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals(0, editor.numApariciones(1, 1, "ho"));
    }

    @Test
    public void encuentraOK() {
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals(2, editor.numApariciones(1, 3, "h"));
    }
}
