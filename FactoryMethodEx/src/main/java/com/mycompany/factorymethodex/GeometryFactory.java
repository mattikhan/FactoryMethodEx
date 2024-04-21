/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethodex;

/**
 *
 * @author matti
 */
public class GeometryFactory {
    public Geometry createGeometry(String type) {
        switch (type) {
            case "Square":
                return new SquareGeometry();
            case "Circle":
                return new CircleGeometry();
            case "Triangle":
                return new TriangleGeometry();
            default:
                throw new IllegalArgumentException("Invalid geometry type: " + type);
        }
    }
}

