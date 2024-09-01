
package com.unicacuca.figures.presentation;

import com.unicacuca.figures.domain.entities.Circle;
import com.unicacuca.figures.domain.entities.Figure;
import com.unicacuca.figures.domain.entities.Square;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author linit
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Probando vector polimorfico :3");
        
        //Crear el Array
        List<Figure> myArray = new ArrayList<>();
        
        //Instanciar las figuras
        Figure figure1 = new Circle(0, 0, 1.0);
        Figure figure2 = new Circle(10, 10, 1.2);
        Figure figure3 = new Square(10, 10, 2.0);
        Figure figure4 = new Square(15, 15, 3.0);
        
        //Insertar las figuras al arreglo.
        myArray.add(figure1);
        myArray.add(figure2);
        myArray.add(figure3);
        myArray.add(figure4);
        
        for(Figure fig:myArray){
            
            //En este punto se prueba el polimorfismo en tiempo de ejecución.
            //El programa ejecuta las versiones de área y perímetro de dos figuras distintas
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.calculatePerimeter());
        }        
        
        System.out.println("Pruebas unitarias");
               
        //Figure figure1 = new Figure(); //Da error
    }
}
