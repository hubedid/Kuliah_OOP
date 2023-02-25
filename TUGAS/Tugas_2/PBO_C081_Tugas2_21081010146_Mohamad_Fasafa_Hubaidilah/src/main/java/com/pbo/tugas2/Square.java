package com.pbo.tugas2;

public class Square {
    private int lengthOfSide;
    public Square(int sisi){
        this.lengthOfSide = sisi;
    }
    public double calculateArea(){
        return this.lengthOfSide*this.lengthOfSide;
    }
    public double calculatePerimeter(){
        return 4*this.lengthOfSide;
    }
}
