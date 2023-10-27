package com.example.adapterpattern.adapters;

import com.example.adapterpattern.pegs.RoundPeg;
import com.example.adapterpattern.pegs.TrianglePeg;

public class TrianglePegAdapter extends RoundPeg {
    TrianglePeg peg;

    public TrianglePegAdapter(TrianglePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double side1 = peg.getSide1();
        double side2 = peg.getSide2();
        double side3 = peg.getSide3();
        double halfPerimeter = (side1 + side2 + side3) / 2;
        double area = Math
                .sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        return (side1 * side2 * side3) / (4 * area);
    }
}
