
package com.unicacuca.figures.domain.entities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 *
 * @author linit
 */
public class CircleTest {
    
    public CircleTest() {
    }

   
    /**
     * Test of calculateArea method, of class Circle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateArea() {
        System.out.println("calculate Area");
        double radius = 1.0;
        Circle instance = new Circle(0 , 0, 1.0);
        
       //Resultado esperado y resultado dado 
        double expResult = Math.PI*radius*radius;
        double result = instance.calculateArea();
        
        //Comparación de los resultados
        assertEquals(expResult, result, 0.01); //Como son decimales no necesariamente debe ser cero
        // TODO review the generated test code and remove the default call to fail
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeter() {
        double radius=5;
        System.out.println("calculatePerimeter");
        Circle instance = new Circle(0,0,5);
        double expResult =2*Math.PI*radius;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
