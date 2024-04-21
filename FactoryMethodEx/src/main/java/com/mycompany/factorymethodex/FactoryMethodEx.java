/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorymethodex;

/**
 *
 * @author matti
 */
public class FactoryMethodEx{
    public static void main(String[] args) {
        GeometryFactory factory = new GeometryFactory();

        // Create a square
        Geometry square = factory.createGeometry("Square");
        square.draw();

        // Create a circle
        Geometry circle = factory.createGeometry("Circle");
        circle.draw();

        // Create a triangle
        Geometry triangle = factory.createGeometry("Triangle");
        triangle.draw();
    }
}
