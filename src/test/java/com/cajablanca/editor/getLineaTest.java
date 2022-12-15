package com.cajablanca.editor;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.*;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class getLineaTest {

    private Editor editor;

    @BeforeEach
    public void setUp() {
        editor = new Editor();
    }

    @Test
    public void getLineaEmptyKO() {
        assertThrows(EmptyCollectionException.class, () -> editor.getLinea(1));
    }

    @Test
    public void getLineaNegativaKO() {
        editor.cargarEditor("ficheroEditor.txt");
        assertThrows(IllegalArgumentException.class, () -> editor.getLinea(-1));
    }

    @Test
    public void getLineaMayorEditorKO() {
        editor.cargarEditor("ficheroEditor.txt");
        assertThrows(IllegalArgumentException.class, () -> editor.getLinea(2));
    }

    @Test
    public void getLineaOK() throws EmptyCollectionException {
        editor.cargarEditor("ficheroEditor.txt");
        assertEquals("[hola]", editor.getLinea(2).toString());
    }
}