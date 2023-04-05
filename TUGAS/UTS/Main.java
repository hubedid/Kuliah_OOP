import java.util.Scanner;
import java.util.ArrayList;

public final class Main {
    public static void main(String[] args){
        ArrayList<Halte> halteTujuan = new ArrayList<Halte>();
        ArrayList<Halte> tempHalteTujuan = new ArrayList<Halte>();
        Scanner sc = new Scanner(System.in);
        boolean cek = false;
        Bus busKantor = new Bus("Bus Kantor");
        do{
            int pilihan = 0;
            String lagi;
            System.out.print("Pilih Menu : \n1. Tambah Awal Halte (Halte Porong, Surabaya, Gresik)\n2. Tambah Awal Bus dari Kantor (3 Turun di Halte Porong, 2 Turun di Halte Gresik)\n3. Tambah Halte Manual\n4. Berangkatkan Bus\n5. Informasi Halte\n6. Informasi Bus\n7. Informasi Lengkap\nMasukkan Nomor : ");
            try{
                pilihan = Integer.parseInt(sc.nextLine());
                switch(pilihan){
                    case 1:
                        Halte Kantor = new Halte("Kantor");
                        Halte Porong = new Halte("Porong");
                        Halte Surabaya = new Halte("Surabaya");
                        Halte Gresik = new Halte("Gresik");
                        halteTujuan.add(Kantor);
                        halteTujuan.add(Porong);
                        halteTujuan.add(Surabaya);
                        halteTujuan.add(Gresik);
                        tempHalteTujuan.addAll(halteTujuan);
                        for (int i = 0; i < 3; i++) {
                            Kantor.tambahPenunggu(Porong);
                        }
                        for (int j = 0; j < 2; j++) {
                            Kantor.tambahPenunggu(Gresik);
                        }
                        Porong.tambahPenunggu(Surabaya);
                        Porong.tambahPenunggu(Gresik);
                        for (int i = 0; i < 5; i++) {
                            Surabaya.tambahPenunggu(Gresik);
                        }
                        System.out.println("Berhasil");
                        break;
                    case 2:
                        for(Halte halte: halteTujuan){
                            busKantor.tambahTujuan(halte);
                        }
                        for(int i = 0; i < 3;i++){
                            busKantor.tambahPenumpang(halteTujuan.get(0), halteTujuan.get(1));
                        }
                        for(int i = 0; i < 2;i++){
                            busKantor.tambahPenumpang(halteTujuan.get(0), halteTujuan.get(3));
                        }
                        System.out.println("Berhasil Menambahkan "+ busKantor.namaBus);
                        break;
                    case 3:
                        System.out.println("maaf pak gak nutut. belum jadi");
                        break;
                    case 4:
                        // busKantor.berangkat();
                        busKantor.turunkanPenumpang(busKantor.berangkat());
                        halteTujuan.removeAll(halteTujuan);
                        halteTujuan.addAll(busKantor.getListTujuan());
                        
                        break;
                    case 5:
                        for(Halte tujuan: tempHalteTujuan){
                            tujuan.getInformasiHalte();
                        }
                        
                        break;
                    case 6:
                        busKantor.informasiBus();
                        break;
                    case 7:
                        for(Halte tujuan: tempHalteTujuan){
                            tujuan.getInformasiHalte();
                        }
                        busKantor.informasiBus();
                        break;
                    default:
                        System.out.println("Pilihan Cuma 7");
                        cek = true;
                        break;
                }
                System.out.print("Kembali Ke Menu? (y/n) : ");
                lagi = sc.nextLine();
                if(lagi.equals("y")) cek = true;
                else cek = false;
            }catch(Exception e){
                System.out.println("Terjadi kesalahan : " + e.getMessage());
                System.out.print("Kembali Ke Menu? (y/n) : ");
                lagi = sc.nextLine();
                if(lagi.equals("y")) cek = true;
                else cek = false;
            }
        }while(cek);
        sc.close();
    }
}
