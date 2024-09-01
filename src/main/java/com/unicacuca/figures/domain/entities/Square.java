
package com.unicacuca.figures.domain.entities;

/**
 *
 * @author linit
 */
public class Square extends Figure{

    private double side;
    
    public Square(double x1, double y1, double side) {
        super(x1, y1);
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
    
    
}
