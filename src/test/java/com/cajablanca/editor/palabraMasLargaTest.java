package com.cajablanca.editor;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class palabraMasLargaTest {

    private Editor editor;

    @BeforeEach
    public void setUp() {
        editor = new Editor();
    }

    @Test
    public void editorVacioOK() throws EmptyCollectionException {
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals(null,editor.palabraMasLarga());
    }

    @Test
    public void editorSinPalabrasOK() throws EmptyCollectionException {
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals(null,editor.palabraMasLarga());

        /**
         * Contenido del fichero:
         * (espacio) solo NO VA, @ solo NO VA, (espacio)@ SI VA ???
         *  */
    }

    @Test
    public void palabraLargaOK() throws EmptyCollectionException {
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals("1111",editor.palabraMasLarga());

        /**
         * Contenido del fichero:
         * lll ll l   ll
         * l ll
         * 1111
         */
    }

}
