/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.unicacuca.figures.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author IngSis
 */
public class RectangleTest {
    
    public RectangleTest() {
    }
    
    /**
     * Test of calculateArea method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateArea() {
        double length=2;
        double width=4;
        System.out.println("calculateArea");
        Rectangle instance = new Rectangle(0, 0, 2,4);;
        double expResult = (length*width);
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calculatePerimeter method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculatePerimeter() {
        double length=2;
        double width=4;
        System.out.println("calculatePerimeter");        
        Rectangle instance = new Rectangle(0, 0, 2,4);
        double expResult = ((2*(length))+(2*(width)));
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
    }
    
}
