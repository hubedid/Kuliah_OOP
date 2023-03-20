public class Kubus {
    private double sisi, volume;

    public Kubus() {
        this.sisi = 1;
    }

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public void SetSisi(double sisi) {
        this.sisi = sisi;
    }

    public void ComputeAndSetVolume() {
        this.volume = this.sisi * this.sisi * this.sisi;
        System.out.println("Volume Kubus : " + this.sisi + " * " + this.sisi + " * " + this.sisi + " = " + GetVolume());
    }

    public double GetVolume() {
        return this.volume;
    }
}
