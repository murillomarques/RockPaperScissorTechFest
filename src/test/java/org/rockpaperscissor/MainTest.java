package org.rockpaperscissor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private void rockPaperScissor(){

    }

    @Test
    void testRockPaperScissor() {
        rockPaperScissor();
        assertEquals(Main.main(), "Hello world!");
    }
}