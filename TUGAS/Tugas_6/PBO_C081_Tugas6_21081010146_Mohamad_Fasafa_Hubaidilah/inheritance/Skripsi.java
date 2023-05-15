public class Skripsi extends Buku {
    private String NPM;
    public Skripsi(String NPM, String judul, String penulis, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.NPM = NPM;
    }
    public String getNPM() {
        return this.NPM;
    }
    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

}
