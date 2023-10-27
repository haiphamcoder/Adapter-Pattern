package com.example.adapterpattern.pegs;

public class RoundPeg{
    private double radius;

    public RoundPeg(){

    }

    public RoundPeg(double radius){
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

}
