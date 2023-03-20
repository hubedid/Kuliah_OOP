public class Bola {
    private double radius, volume;
    private final double phi = 22 / 7;

    public Bola() {
        this.radius = 1;
    }

    public Bola(double radius) {
        this.radius = radius;
    }

    public void SetRadius(double radius) {
        this.radius = radius;
    }

    public void ComputeAndSetVolume() {
        this.volume = this.phi * this.radius * this.radius * this.radius * 4 / 3;
        System.out.println("Volume Bola : " + this.phi + " * " + this.radius + " * " + this.radius + " * " + this.radius + " * (4/3)" + " = " + GetVolume());

    }

    public double GetVolume() {
        return this.volume;
    }

}
