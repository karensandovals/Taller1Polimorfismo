/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicacuca.figures.domain.entities;

/**
 *
 * @author IngSis
 */
public class Triangle extends Figure{

    private double base; 
    private double height;
    public Triangle(double x1, double y1, double base, double height ) {
        super(x1, y1);
        this.base= base;
        this.height=height;
    }

    @Override
    public double calculateArea() {
        double area = ((base*height)/2);
        return area;
    } 

    @Override
    public double calculatePerimeter() {
       double perimeter =  (3*(base)); 
return perimeter;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
