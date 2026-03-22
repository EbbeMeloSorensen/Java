package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void testAdd() {
        MyMath math = new MyMath();
        assertEquals(5, math.add(2, 3));
    }
}
