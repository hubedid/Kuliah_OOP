public class Masjid extends Mushola {
    private Boolean airConditioner;

    public Masjid(String nama, String alamat, String deskripsi, String gambar, String kategori, String latitude, String longitude, Boolean soundSistem, int kapasitas, String jamOperasional, String tahunBerdiri, Double luasTanah, int jumlahKamarMandi, int jumlahLampu, int jumlahPintu, Boolean sajadah, int jumlahRak, int jumlahSarung, int jumlahMukena, int jumlahTempatWudhu, int jumlahKipasAngin, Boolean airConditioner) {
        super(nama, alamat, deskripsi, gambar, kategori, latitude, longitude, soundSistem, kapasitas, jamOperasional, tahunBerdiri, luasTanah, jumlahKamarMandi, jumlahLampu, jumlahPintu, sajadah, jumlahRak, jumlahSarung, jumlahMukena, jumlahTempatWudhu, jumlahKipasAngin);
        this.airConditioner = airConditioner;
    }

    public Masjid(String nama, String alamat, String deskripsi, String gambar, String kategori, String latitude, String longitude, Boolean soundSistem, int kapasitas, String jamOperasional, String tahunBerdiri, Double luasTanah, int jumlahKamarMandi, int jumlahLampu, int jumlahPintu, Boolean sajadah, int jumlahRak, int jumlahSarung, int jumlahMukena, int jumlahTempatWudhu, int jumlahKipasAngin) {
        super(nama, alamat, deskripsi, gambar, kategori, latitude, longitude, soundSistem, kapasitas, jamOperasional, tahunBerdiri, luasTanah, jumlahKamarMandi, jumlahLampu, jumlahPintu, sajadah, jumlahRak, jumlahSarung, jumlahMukena, jumlahTempatWudhu, jumlahKipasAngin);
    }

    public Masjid() {
    }

    public Boolean getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(Boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    // override method
    public void kumandangkanAdzanDzuhur() {
        System.out.println("Adzan Dzuhur dikumandangkan");
    }

    public void kumandangkanAdzanAshar() {
        System.out.println("Adzan Ashar dikumandangkan");
    }

    // custom method
    public void kumandangkanAdzanJumat() {
        System.out.println("Adzan Jumat dikumandangkan");
    }
}
