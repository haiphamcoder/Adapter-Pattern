package com.example.adapterpattern.adapters;

import com.example.adapterpattern.pegs.RoundPeg;
import com.example.adapterpattern.pegs.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getSide() / 2), 2) * 2);
    }
}
