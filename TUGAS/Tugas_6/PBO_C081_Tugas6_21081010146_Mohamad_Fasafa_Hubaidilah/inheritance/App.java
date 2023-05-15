public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------- set Koleksi dari konstruktor ---------");
        Koleksi koleksi = new Koleksi("Koleksi Buku", "Buku-buku yang ada di perpustakaan", 2018 );
        System.out.println("Judul: " + koleksi.getJudul());
        System.out.println("Penerbit: " + koleksi.getPenerbit());
        System.out.println("Tahun: " + koleksi.getTahun());
        System.out.println("---------------------------------------");

        System.out.println("--------- set Koleksi baru dari method set ---------");
        koleksi.setJudul("Koleksi Buku Baru");
        koleksi.setPenerbit("Buku-buku yang ada di perpustakaan baru");
        koleksi.setTahun(2019);
        System.out.println("Judul: " + koleksi.getJudul());
        System.out.println("Penerbit: " + koleksi.getPenerbit());
        System.out.println("Tahun: " + koleksi.getTahun());
        System.out.println("---------------------------------------");

        System.out.println("--------- set Buku dari konstruktor ---------");
        Buku buku = new Buku("Buku", "Penulis Buku", "Penulis Buku", 2018);
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Penulis: " + buku.getPenulis());
        System.out.println("Penerbit: " + buku.getPenerbit());
        System.out.println("Tahun: " + buku.getTahun());
        System.out.println("---------------------------------------");

        System.out.println("--------- set Buku baru dari method set ---------");
        buku.setJudul("Buku Baru");
        buku.setPenulis("Penulis Buku Baru");
        buku.setPenerbit("Penerbit Buku Baru");
        buku.setTahun(2019);
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Penulis: " + buku.getPenulis());
        System.out.println("Penerbit: " + buku.getPenerbit());
        System.out.println("Tahun: " + buku.getTahun());
        System.out.println("---------------------------------------");

        System.out.println("--------- set Majalah dari konstruktor ---------");
        Majalah majalah = new Majalah("Majalah", "Edisi Majalah", "Penerbit Majalah", 2018);
        System.out.println("Judul: " + majalah.getJudul());
        System.out.println("Edisi: " + majalah.getEdisi());
        System.out.println("Penerbit: " + majalah.getPenerbit());
        System.out.println("Tahun: " + majalah.getTahun());
        System.out.println("---------------------------------------");

        System.out.println("--------- set Majalah baru dari method set ---------");
        majalah.setJudul("Majalah Baru");
        majalah.setEdisi("Edisi Majalah Baru");
        majalah.setPenerbit("Penerbit Majalah Baru");
        majalah.setTahun(2019);
        System.out.println("Judul: " + majalah.getJudul());
        System.out.println("Edisi: " + majalah.getEdisi());
        System.out.println("Penerbit: " + majalah.getPenerbit());
        System.out.println("Tahun: " + majalah.getTahun());
        System.out.println("---------------------------------------");

        System.out.println("--------- set Skripsi dari konstruktor ---------");
        Skripsi skripsi = new Skripsi("21081010146", "Skripsi", "Penulis Skripsi", "Penerbit Skripsi", 2018);
        System.out.println("NM: " + skripsi.getNPM());
        System.out.println("Judul: " + skripsi.getJudul());
        System.out.println("Penulis: " + skripsi.getPenulis());
        System.out.println("Penerbit: " + skripsi.getPenerbit());
        System.out.println("Tahun: " + skripsi.getTahun());
        System.out.println("---------------------------------------");

        System.out.println("--------- set Skripsi baru dari method set ---------");
        skripsi.setNPM("21081010147");
        skripsi.setJudul("Skripsi Baru");
        skripsi.setPenulis("Penulis Skripsi Baru");
        skripsi.setPenerbit("Penerbit Skripsi Baru");
        skripsi.setTahun(2019);
        System.out.println("NPM: " + skripsi.getNPM());
        System.out.println("Judul: " + skripsi.getJudul());
        System.out.println("Penulis: " + skripsi.getPenulis());
        System.out.println("Penerbit: " + skripsi.getPenerbit());
        System.out.println("Tahun: " + skripsi.getTahun());
        System.out.println("---------------------------------------");
    }
}