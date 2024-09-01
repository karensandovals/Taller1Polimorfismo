/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.unicacuca.figures.domain.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author IngSis
 */
public class TriangleTest {

    public TriangleTest() {
    }

    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");

        double base=3;
        double height=3;
        Triangle instance = new Triangle(0, 0, 3, 3);
        double expResult = ((base * height) / 2);
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @Test
    public void testCalculatePerimeter() {
        double base=3;
        double height=3;
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(0,0,3,3);
        double expResult = (3*(base));
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

    }

}
