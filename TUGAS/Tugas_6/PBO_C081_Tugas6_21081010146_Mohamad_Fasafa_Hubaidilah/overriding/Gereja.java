public class Gereja extends TempatIbadah {
    private int jumlahKursi;
    private int jumlahMeja;
    private Boolean lonceng;

    public Gereja(String nama, String alamat, String deskripsi, String gambar, String kategori, String latitude, String longitude, Boolean soundSistem, int kapasitas, String jamOperasional, String tahunBerdiri, Double luasTanah, int jumlahKamarMandi, int jumlahLampu, int jumlahPintu, int jumlahKursi, int jumlahMeja, Boolean lonceng) {
        super(nama, alamat, deskripsi, gambar, kategori, latitude, longitude, soundSistem, kapasitas, jamOperasional, tahunBerdiri, luasTanah, jumlahKamarMandi, jumlahLampu, jumlahPintu);
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        this.lonceng = lonceng;
    }

    public Gereja(String nama, String alamat, String deskripsi, String gambar, String kategori, String latitude, String longitude, Boolean soundSistem, int kapasitas, String jamOperasional, String tahunBerdiri, Double luasTanah, int jumlahKamarMandi, int jumlahLampu, int jumlahPintu) {
        super(nama, alamat, deskripsi, gambar, kategori, latitude, longitude, soundSistem, kapasitas, jamOperasional, tahunBerdiri, luasTanah, jumlahKamarMandi, jumlahLampu, jumlahPintu);
    }

    public Gereja() {
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    public Boolean getLonceng() {
        return lonceng;
    }

    public void setLonceng(Boolean lonceng) {
        this.lonceng = lonceng;
    }

    public void nyalakanLonceng(){
        System.out.println("Lonceng dinyalakan");
    }
}
