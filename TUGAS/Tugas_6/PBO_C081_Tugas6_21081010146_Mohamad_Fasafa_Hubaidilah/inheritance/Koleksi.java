public class Koleksi {
    private String judul, penerbit;
    private int tahun;

    public Koleksi(String judul, String penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    public String getJudul() {
        return this.judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPenerbit() {
        return this.penerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public int getTahun() {
        return this.tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
