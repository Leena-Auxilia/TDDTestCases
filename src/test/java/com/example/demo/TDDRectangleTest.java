package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TDDRectangleTest {

    rectangleCalculations myRectangleCalculations = new rectangleCalculations();

    @Test
    void testRectangleAreaWhenBothValuesArePositive() {
        float expectedArea = 120f;
        float myRectangleArea = myRectangleCalculations.calculateArea(10f,12f);
        assertEquals(expectedArea, myRectangleArea);
    }
    @Test
    void testRectangleAreaWhenWidthIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> myRectangleCalculations.calculateArea(-3, 3));
    }
    @Test
    void testRectangleAreaWhenLengthIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> myRectangleCalculations.calculateArea(3, -3));
    }
    @Test
    void testRectangleAreaWhenBothValuesAreNegative(){
        assertThrows(IllegalArgumentException.class, () -> myRectangleCalculations.calculateArea(-3, -3));
    }
    @Test
    void testRectanglePerimeterWhenBothValuesArePositive(){
        float expectedPerimeter = 20;
        float actualPerimeter = myRectangleCalculations.calculatePerimeter(4, 6);
        assertEquals(expectedPerimeter, actualPerimeter);
    }
    @Test
    void testRectanglePerimeterWhenWidthIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> myRectangleCalculations.calculatePerimeter(-3, 3));
    }
    @Test
    void testRectanglePerimeterWhenLengthIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> myRectangleCalculations.calculatePerimeter(3, -3));
    }
    @Test
    void testRectanglePerimeterWhenBothValuesAreNegative(){
        assertThrows(IllegalArgumentException.class, () -> myRectangleCalculations.calculatePerimeter(-3, -3));
    }
}
