package com.pbo.tugas2;

public class Rectangle {
    private int width, height;
    public Rectangle(int lebar, int panjang){
        this.height = panjang;
        this.width = lebar;
    }
    public double calculateArea(){
        return this.height*this.width;
    }
    public double calculatePerimeter(){
        return 2*(this.height+this.width);
    }
}
