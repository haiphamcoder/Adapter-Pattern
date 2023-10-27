package com.example.adapterpattern.pegs;

public class SquarePeg {
    private double side;

    public SquarePeg(double side) {
        if (side >= 0) {
            this.side = side;
        } else {
            System.out.println("Side must be positive");
            this.side = 0;
        }
    }

    public double getSide() {
        return side;
    }
}
