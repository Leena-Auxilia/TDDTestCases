package com.example.demo;

public class squareCalculations {
    public float calculateArea(float mySquareSide) {
        if(mySquareSide<=0)
        {
            throw new IllegalArgumentException("Side of the Square should be Positive.");
        }
        else {
            return mySquareSide * mySquareSide;
        }
    }

    public float calculatePerimeter(float mySquareSide) {
        if(mySquareSide<=0)
        {
            throw new IllegalArgumentException("Side of the Square should be Positive.");
        }
        else {
            return 4 * mySquareSide;
        }
    }
}
