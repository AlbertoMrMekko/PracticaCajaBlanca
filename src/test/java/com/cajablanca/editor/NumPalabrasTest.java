package com.cajablanca.editor;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class NumPalabrasTest {

    private Editor editor;

    @BeforeEach
    public void setUp() {
        editor = new Editor();
    }

    @Test
    public void editorVacioKO() {
        editor.cargarEditor("ficheroEditor.txt");
        assertThrows(EmptyCollectionException.class, () ->
                editor.numPalabras());
    }

    @Test
    public void ficheroSinPalabrasOK() throws EmptyCollectionException {
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals(0, editor.numPalabras());
        /**
         * Contenido del fichero: (salto de línea) (CP no entra al for y CP if siguiente = False)
         *
         *
         */
    }

    @Test
    public void ficheroConPalabrasOK()throws EmptyCollectionException {
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals(6, editor.numPalabras());
        /**
         * Contenido del fichero:
         * j j j j 1
         *   jj1
         */
    }
}
