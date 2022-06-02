package com.example.demo;

import java.util.Scanner;

public class rectangleCalculations {
    public static void run(){
        System.out.println("Testing successful");
    }


    public float calculateArea(float width, float height) {
        return width * height;
    }

    public float calculatePerimeter(float myWidth, float myHeight) {
        return 2* (myWidth + myHeight);
    }
}
