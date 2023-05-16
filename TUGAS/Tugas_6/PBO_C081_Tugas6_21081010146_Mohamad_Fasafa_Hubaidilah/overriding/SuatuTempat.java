public class SuatuTempat {
    private String nama;
    private String alamat;
    private String deskripsi;
    private String gambar;
    private String kategori;
    private String latitude;
    private String longitude;

    public SuatuTempat(String nama, String alamat, String deskripsi, String gambar, String kategori, String latitude, String longitude) {
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.kategori = kategori;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public SuatuTempat() {
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public String getKategori() {
        return kategori;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


}