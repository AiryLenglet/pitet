package me.lenglet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomethingTest {

    @Test
    void test() {
        final var something = new Something();
        assertEquals(0, something.inc());
        assertEquals(1, something.inc());
    }
}