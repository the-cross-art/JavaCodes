package com.company;

//public class Wall {
//
//    private double width;
//    private double height;
//
//    public double getArea(double width, double height){
//        if (height < 0){
//
//            this.height = 0;
//
//        } else {
//
//            this.height = height;
//
//        }
//
//        if (width < 0){
//
//            this.width = 0;
//
//        } else {
//
//            this.width = width;
//
//        }
//        return this.height*this.width;
//    }
//
//    public Wall(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    public double getArea(){
//        return this.height*this.width;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        if(width<0){
//            this.width = 0;
//        }
//        this.width = width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        if(height<0){
//            this.height = 0;
//        }
//        this.height = height;
//    }
//}

public class Wall {



    private double width;

    private double height;



    public Wall(){

    }

    public Wall(double width, double height) {



        if (height < 0){

            this.height = 0;

        } else {

            this.height = height;

        }



        if (width < 0){

            this.width = 0;

        } else {

            this.width = width;

        }

    }



    public double getWidth() {

        return width;

    }



    public void setWidth(double width) {

        if (width < 0){

            this.width = 0;

        } else {

            this.width = width;

        }

    }



    public double getHeight() {

        return height;

    }



    public void setHeight(double height) {

        if (height < 0){

            this.height = 0;

        } else {

            this.height = height;

        }

    }

    public double getArea(){

        return this.height * this.width;

    }

}

