package com.example.demo;

import org.junit.jupiter.api.Test;
import java.awt.*;
import java.io.InputStream;

public class TDDFirstTest {

    rectangleCalculations myRectangleCalculations = new rectangleCalculations();
    @Test
    void testRectangleArea() {
        float myWidth = 10.5f;
        float myHeight = 12f;

        float myRectangleArea = myRectangleCalculations.calculateArea(myWidth,myHeight);
        System.out.println("The area of the Rectangle is : " + myRectangleArea);
    }
    @Test
    void testRectanglePerimeter(){
        float myWidth = 10.5f;
        float myHeight = 12f;

        float myRectanglePerimeter = myRectangleCalculations.calculatePerimeter(myWidth,myHeight);
        System.out.println("The perimeter of the Rectangle is : " + myRectanglePerimeter);

    }
}
