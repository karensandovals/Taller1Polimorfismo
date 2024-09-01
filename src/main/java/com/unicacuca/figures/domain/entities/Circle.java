
package com.unicacuca.figures.domain.entities;

/**
 *
 * @author linit
 */
public class Circle extends Figure{
    
    private double radius;
    
    public Circle(double x1, double y1, double radius){
        super(x1, y1);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }   
    
}
