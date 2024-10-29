package org.example;

public class Duzbucaqli {
    private double width;
    private double length;


    public Duzbucaqli() {

    }

    public Duzbucaqli(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double Perimeter() {
        return 2 * (width + length);
    }

    public double Sahe() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("Duzbucaqli(width=%.2f,length=%.2f, perimeter=%.2f,sahe=%.2f)",
                width, length, Perimeter(), Sahe());
    }
}
