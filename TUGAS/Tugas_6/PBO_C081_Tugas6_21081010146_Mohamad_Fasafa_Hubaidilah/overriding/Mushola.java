public class Mushola extends TempatIbadah{
    private Boolean sajadah;
    private int jumlahRak;
    private int jumlahSarung;
    private int jumlahMukena;
    private int jumlahTempatWudhu;
    private int jumlahKipasAngin;

    public Mushola(String nama, String alamat, String deskripsi, String gambar, String kategori, String latitude, String longitude, Boolean soundSistem, int kapasitas, String jamOperasional, String tahunBerdiri, Double luasTanah, int jumlahKamarMandi, int jumlahLampu, int jumlahPintu, Boolean sajadah, int jumlahRak, int jumlahSarung, int jumlahMukena, int jumlahTempatWudhu, int jumlahKipasAngin) {
        super(nama, alamat, deskripsi, gambar, kategori, latitude, longitude, soundSistem, kapasitas, jamOperasional, tahunBerdiri, luasTanah, jumlahKamarMandi, jumlahLampu, jumlahPintu);
        this.sajadah = sajadah;
        this.jumlahRak = jumlahRak;
        this.jumlahSarung = jumlahSarung;
        this.jumlahMukena = jumlahMukena;
        this.jumlahTempatWudhu = jumlahTempatWudhu;
        this.jumlahKipasAngin = jumlahKipasAngin;
    }

    public Mushola(String nama, String alamat, String deskripsi, String gambar, String kategori, String latitude, String longitude, Boolean soundSistem, int kapasitas, String jamOperasional, String tahunBerdiri, Double luasTanah, int jumlahKamarMandi, int jumlahLampu, int jumlahPintu) {
        super(nama, alamat, deskripsi, gambar, kategori, latitude, longitude, soundSistem, kapasitas, jamOperasional, tahunBerdiri, luasTanah, jumlahKamarMandi, jumlahLampu, jumlahPintu);
    }

    public Mushola() {
    }

    public Boolean getSajadah() {
        return sajadah;
    }

    public void setSajadah(Boolean sajadah) {
        this.sajadah = sajadah;
    }

    public int getJumlahRak() {
        return jumlahRak;
    }

    public void setJumlahRak(int jumlahRak) {
        this.jumlahRak = jumlahRak;
    }

    public int getJumlahSarung() {
        return jumlahSarung;
    }

    public void setJumlahSarung(int jumlahSarung) {
        this.jumlahSarung = jumlahSarung;
    }

    public int getJumlahMukena() {
        return jumlahMukena;
    }

    public void setJumlahMukena(int jumlahMukena) {
        this.jumlahMukena = jumlahMukena;
    }

    public int getJumlahTempatWudhu() {
        return jumlahTempatWudhu;
    }

    public void setJumlahTempatWudhu(int jumlahTempatWudhu) {
        this.jumlahTempatWudhu = jumlahTempatWudhu;
    }

    public int getJumlahKipasAngin() {
        return jumlahKipasAngin;
    }

    public void setJumlahKipasAngin(int jumlahKipasAngin) {
        this.jumlahKipasAngin = jumlahKipasAngin;
    }

    // custom method
    
    public void kumandangkanAdzanSubuh(){
        System.out.println("Adzan subuh dikumandangkan");
    }

    public void kumandangkanAdzanDzuhur(){
        System.out.println("Tidak ada adzan dzuhur dikumandangkan");
    }

    public void kumandangkanAdzanAshar(){
        System.out.println("Tidak ada adzan ashar dikumandangkan");
    }

    public void kumandangkanAdzanMaghrib(){
        System.out.println("Adzan maghrib dikumandangkan");
    }

    public void kumandangkanAdzanIsya(){
        System.out.println("Adzan isya dikumandangkan");
    }

}
