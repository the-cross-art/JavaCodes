package com.company;

public class Floor {

    private double length;
    private double width;

    public Floor(){

    }

    public Floor(double length, double width) {
        if(length<0){
            this.length=0;
        }
        if(width<0){
            this.width=0;
        }
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.length*this.width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
