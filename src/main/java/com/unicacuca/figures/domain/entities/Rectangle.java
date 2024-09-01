
package com.unicacuca.figures.domain.entities;

/**
 *
 * @author linit
 */
public class Rectangle extends Figure{

    private double length;
    private double width;

    public Rectangle(double x1, double y1, double length, double width) {
        super(x1, y1);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
     
    @Override
    public double calculateArea() {
        return (this.length*this.width);
    }

    @Override
    public double calculatePerimeter() {
        return ((2*(this.length))+(2*(this.width)));
    }
    
}