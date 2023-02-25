package com.pbo.tugas2;

public class Circle {
    private int radius;
    public Circle(int jari){
        this.radius = jari;
    }
    public double calculateArea(){
        return 3.14*this.radius*this.radius;
    }
    public double calculatePerimeter(){
        return 3.14*2*this.radius;
    }
}
