/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericbruno.library2;

/**
 *
 * @author ebruno
 */
public class MyLibrary2Impl implements MyLibrary2 {

    @Override
    public double sine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }

    @Override
    public double cosine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.cos(radians);
    }

    @Override
    public double tangent(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.tan(radians);
    }
    
}
