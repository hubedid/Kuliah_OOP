public class TempatIbadah extends SuatuTempat{
    private Boolean soundSistem;
    private int kapasitas;
    private String jamOperasional;
    private String tahunBerdiri;
    private Double luasTanah;
    private int jumlahKamarMandi;
    private int jumlahLampu;
    private int jumlahPintu;


    public TempatIbadah(String nama, String alamat, String deskripsi, String gambar, String kategori, String latitude, String longitude, Boolean soundSistem, int kapasitas, String jamOperasional, String tahunBerdiri, Double luasTanah, int jumlahKamarMandi, int jumlahLampu, int jumlahPintu) {
        super(nama, alamat, deskripsi, gambar, kategori, latitude, longitude);
        this.soundSistem = soundSistem;
        this.kapasitas = kapasitas;
        this.jamOperasional = jamOperasional;
        this.tahunBerdiri = tahunBerdiri;
        this.luasTanah = luasTanah;
        this.jumlahKamarMandi = jumlahKamarMandi;
        this.jumlahLampu = jumlahLampu;
        this.jumlahPintu = jumlahPintu;
    }

    public TempatIbadah(String nama, String alamat, String deskripsi, String gambar, String kategori, String latitude, String longitude) {
        super(nama, alamat, deskripsi, gambar, kategori, latitude, longitude);
    }

    public TempatIbadah() {
    }

    public Boolean getSoundSistem() {
        return soundSistem;
    }

    public void setSoundSistem(Boolean soundSistem) {
        this.soundSistem = soundSistem;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getJamOperasional() {
        return jamOperasional;
    }

    public void setJamOperasional(String jamOperasional) {
        this.jamOperasional = jamOperasional;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public Double getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(Double luasTanah) {
        this.luasTanah = luasTanah;
    }

    public int getJumlahKamarMandi() {
        return jumlahKamarMandi;
    }

    public void setJumlahKamarMandi(int jumlahKamarMandi) {
        this.jumlahKamarMandi = jumlahKamarMandi;
    }

    public int getJumlahLampu() {
        return jumlahLampu;
    }

    public void setJumlahLampu(int jumlahLampu) {
        this.jumlahLampu = jumlahLampu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void nyalakanSpeaker(){
        System.out.println("Speaker dinyalakan");
    }

    public void matikanSpeaker(){
        System.out.println("Speaker dimatikan");
    }

    public void nyalakanLampu(){
        System.out.println("Lampu dinyalakan");
    }

    public void matikanLampu(){
        System.out.println("Lampu dimatikan");
    }

    public void bukaPintu(){
        System.out.println("Pintu dibuka");
    }

    public void tutupPintu(){
        System.out.println("Pintu ditutup");
    }

    public void flushToilet(){
        System.out.println("Toilet dibilas");
    }

    public void isiToilet(){
        System.out.println("Toilet diisi");
    }

    // overloading method

    public void isiToilet(int jumlahAir){
        System.out.println("Toilet diisi dengan " + jumlahAir + " liter air");
    }

    public void nyalakanLampu(int jumlahLampu){
        System.out.println("Lampu dinyalakan sebanyak " + jumlahLampu + " buah");
    }

    public void matikanLampu(int jumlahLampu){
        System.out.println("Lampu dimatikan sebanyak " + jumlahLampu + " buah");
    }

    public void bukaPintu(int jumlahPintu){
        System.out.println("Pintu dibuka sebanyak " + jumlahPintu + " buah");
    }

    public void tutupPintu(int jumlahPintu){
        System.out.println("Pintu ditutup sebanyak " + jumlahPintu + " buah");
    }


}
