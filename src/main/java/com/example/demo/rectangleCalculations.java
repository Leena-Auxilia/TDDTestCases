package com.example.demo;

import java.util.Scanner;

public class rectangleCalculations {
    public static void run(){
        System.out.println("Testing successful");
    }


    public float calculateArea(float width, float height) {
        if(width<=0)
        {
            throw new IllegalArgumentException("Width/Length of the Rectangle should be Positive.");
        }
        if(height<=0)
        {
            throw new IllegalArgumentException("Height of the Rectangle should be Positive.");
        }
        else {
            return width * height;
        }
    }

    public float calculatePerimeter(float width, float height) {
        if(width<=0)
        {
            throw new IllegalArgumentException("Width/Length of the Rectangle should be Positive.");
        }
        if(height<=0)
        {
            throw new IllegalArgumentException("Height of the Rectangle should be Positive.");
        }
        else {
            return 2 * (width + height);
        }
    }
}
