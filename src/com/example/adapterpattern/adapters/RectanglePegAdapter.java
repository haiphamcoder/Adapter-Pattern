package com.example.adapterpattern.adapters;

import com.example.adapterpattern.pegs.RectanglePeg;
import com.example.adapterpattern.pegs.RoundPeg;

public class RectanglePegAdapter extends RoundPeg{
    private RectanglePeg peg;

    public RectanglePegAdapter(RectanglePeg peg){
        this.peg = peg;
    }

    @Override
    public double getRadius(){
        double width = peg.getWidth();
        double height = peg.getHeight();
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)) / 2;
    }
}
