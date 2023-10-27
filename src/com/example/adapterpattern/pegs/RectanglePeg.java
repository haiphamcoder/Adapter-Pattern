package com.example.adapterpattern.pegs;

public class RectanglePeg {
    private double width;
    private double height;

    public RectanglePeg(double width, double height) {
        if (width >= 0 && height >= 0) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Width and height must be positive");
            this.width = 0;
            this.height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
