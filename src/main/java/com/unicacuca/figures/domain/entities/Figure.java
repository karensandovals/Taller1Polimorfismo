
package com.unicacuca.figures.domain.entities;

/**
 *
 * @author linit
 */

/*No se puede instanciar de una clase abstracta. De ella se crean clases hijas y las clases hijas
    sí pueden instanciar
     */
public abstract class Figure {
   
    private double x1;
    private double y1;
    
    
    public Figure(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }   
        
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
}
