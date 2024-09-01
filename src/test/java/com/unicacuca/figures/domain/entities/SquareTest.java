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
public class SquareTest {

    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        double side=4;
        System.out.println("calculateArea");
        Square instance = new Square (0, 0, 4);
        double expResult = side*side;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calculatePerimeter method, of class Square.
     */
    @Test
    public void testCalculatePerimeter() {
         double side=4;
        System.out.println("calculatePerimeter");
        Square instance = new Square (0, 0, 4);
        double expResult = 4*side;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
    }
    
}
