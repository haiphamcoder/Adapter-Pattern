package com.example.adapterpattern.holes;

import com.example.adapterpattern.pegs.RoundPeg;

public class RoundHole {
    private double radius;

    public RoundHole(){

    }

    public RoundHole(double radius){
        if(radius >= 0){
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive");
            this.radius = 0;
        }
    }

    public double getRadius(){
        return radius;
    }

    public boolean fits(RoundPeg peg){
        return this.getRadius() >= peg.getRadius();
    }
}
