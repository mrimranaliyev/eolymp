package org.example;

public class Paralilipiped extends Duzbucaqli {


    private double height;


    public Paralilipiped() {
    }

    public Paralilipiped(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double volume() {
        return super.Sahe() * height;
    }

    public double squre() {
        return super.Perimeter() * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Paralilipiped(height=%.2f,volume=%.2f,squre=%.2f)", height, volume(), squre());
    }

}
