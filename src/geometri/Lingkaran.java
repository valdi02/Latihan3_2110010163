/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

/**
 *
 * @author valdi
 */
public class Lingkaran {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double luas() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double keliling() {
        return 2 * Math.PI * radius;
    }
}
