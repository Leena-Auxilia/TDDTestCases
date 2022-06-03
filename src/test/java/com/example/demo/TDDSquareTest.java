package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TDDSquareTest {

    squareCalculations mySquareCalculations = new squareCalculations();

    @Test
    void testSquareAreaWhenSideIsPositive() {
        float expectedArea = 25;
        float mySquareArea = mySquareCalculations.calculateArea(5f);
        assertEquals(expectedArea, mySquareArea);
    }

    @Test
    void testSquareAreaWhenSideIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> mySquareCalculations.calculateArea(-3));
    }

    @Test
    void testSquarePerimeterWhenSideIsPositive() {
        float expectedPerimeter = 20;
        float mySquarePerimeter = mySquareCalculations.calculatePerimeter(5);
        assertEquals(expectedPerimeter, mySquarePerimeter);
    }

    @Test
    void testSquarePerimeterWhenSideIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> mySquareCalculations.calculatePerimeter(-3));
    }
}