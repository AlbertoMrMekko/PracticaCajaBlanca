package com.cajablanca.editor;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class existePalabraTest {

    private Editor editor;

    @BeforeEach
    public void setUp() {
        editor = new Editor();
        editor.cargarEditor("ficheroEditor.txt");
    }

    @Test
    public void editorVacioOK() throws EmptyCollectionException {
        assertEquals(false, editor.existePalabra("hola"));
    }

    @Test
    public void editorSinPalabrasOK() throws EmptyCollectionException {
        assertEquals(false, editor.existePalabra("hola"));

        /**
         * Contenido del fichero: (espacio . \n)
         *
         */
    }

    @Test
    public void noExistePalabraOK() throws EmptyCollectionException {
        assertFalse(editor.existePalabra("hola"));

        /**
         * Contenido del fichero:
         * adios
         */
    }

    @Test
    public void existePalabraOK() throws EmptyCollectionException {
        assertEquals(true, editor.existePalabra("hola"));
        /**
         * Contenido del fichero:
         *  1
         *  1
         *  hola
         */
    }

}
