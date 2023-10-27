package com.example.adapterpattern.pegs;

public class TrianglePeg {
    private double side1;
    private double side2;
    private double side3;

    public TrianglePeg(double side1, double side2, double side3) {
        if (validTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Invalid triangle");
            this.side1 = 0;
            this.side2 = 0;
            this.side3 = 0;
        }
    }

    private boolean validTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
