package com.pbo.tugas2;

public class Ellipse {
    private int semiMajorAxis, semiMinorAxis;
    public Ellipse(int major, int minor){
        this.semiMajorAxis = major;
        this.semiMinorAxis = minor;
    }
    public double calculateArea(){
        return 3.14*this.semiMajorAxis*this.semiMinorAxis;
    }
    public double calculatePerimeter(){
        return 3.14*(this.semiMajorAxis+this.semiMinorAxis);
    }
}
