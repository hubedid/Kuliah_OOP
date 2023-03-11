import java.util.Scanner;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cek = false, cek2 = false;
        System.out.println("======== Luas & Keliling Bangun Datar ==========");
        do{
            int pilihan = 0;
            int operasi = 0;
            System.out.print("Pilih Bangun \n1. Kubus\n2. Balok\n3. Tabung\n4. Bola\n5. Limas Segi Empat\nMasukkan Nomor : ");
            try{
                pilihan = Integer.parseInt(sc.nextLine());
                switch(pilihan){
                    case 1:
                        do{
                            System.out.print("Pilihan Input \n1. Input Manual(sisi)\n2. Tanpa Input(default: 1)\nMasukkan Nomor : ");
                            try{
                                operasi = Integer.parseInt(sc.nextLine());
                                if(!(operasi >= 1 && operasi <= 2)){
                                    System.out.println("Pilihan Cuma 2");
                                    cek2 = true;
                                }else{ cek2 = false; }
                            }catch(Exception e){
                                System.out.println("Input Salah!");
                                cek2 = true;
                            }
                            
                        }while(cek2);
                        if(operasi == 1){ 
                            System.out.print("Masukkan Sisi : ");
                            int sisi = Integer.parseInt(sc.nextLine());                    
                            Kubus kubus = new Kubus(sisi);
                            kubus.ComputeAndSetVolume();
                            System.out.println("Hasil : " + kubus.GetVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            Kubus kubus = new Kubus();
                            kubus.ComputeAndSetVolume();
                            System.out.println("Hasil : " + kubus.GetVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }
                        break;
                    case 2:
                        do{
                            System.out.print("Pilihan Input \n1. Input Manual(panjang [other default: 1])\n2. Input Manual(panjang, lebar [other default: 1])\n3. Input Manual(panjang, lebar, tinggi)\n4. Tanpa Input (default: 1)\nMasukkan Nomor : ");
                            try{
                                operasi = Integer.parseInt(sc.nextLine());
                                if(!(operasi >= 1 && operasi <= 4)){
                                    System.out.println("Pilihan Cuma 4");
                                    cek2 = true;
                                }else{ cek2 = false; }
                            }catch(Exception e){
                                System.out.println("Input Salah!");
                                cek2 = true;
                            }
                        }while(cek2);
                        if(operasi == 1){ 
                            System.out.print("Masukkan Panjang : ");
                            int panjang = Integer.parseInt(sc.nextLine());
                            Balok balok = new Balok(panjang);
                            balok.ComputeAndSetVolume();
                            System.out.println("Hasil : " + balok.getVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            System.out.print("Masukkan Panjang : ");
                            int panjang = Integer.parseInt(sc.nextLine());
                            System.out.print("Masukkan Lebar : ");
                            int lebar = Integer.parseInt(sc.nextLine());
                            Balok balok = new Balok(panjang, lebar);
                            balok.ComputeAndSetVolume();
                            System.out.println("Hasil : " + balok.getVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 3){
                            System.out.print("Masukkan Panjang : ");
                            int panjang = Integer.parseInt(sc.nextLine());
                            System.out.print("Masukkan Lebar : ");
                            int lebar = Integer.parseInt(sc.nextLine());
                            System.out.print("Masukkan Tinggi : ");
                            int tinggi = Integer.parseInt(sc.nextLine());
                            Balok balok = new Balok(panjang, lebar, tinggi);
                            balok.ComputeAndSetVolume();
                            System.out.println("Hasil : " + balok.getVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else{
                            Balok balok = new Balok();
                            balok.ComputeAndSetVolume();
                            System.out.println("Hasil : " + balok.getVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }
                        break;
                    case 3:
                        do{
                            System.out.print("Pilihan Input \n1. Input Manual(jari-jari [other default: 1])\n2. Input Manual(jari-jari, tinggi)\n3. Tanpa Input(default: 1)\nMasukkan Nomor : ");
                            try{
                                operasi = Integer.parseInt(sc.nextLine());
                                if(!(operasi >= 1 && operasi <= 3)){
                                    System.out.println("Pilihan Cuma 3");
                                    cek2 = true;
                                }else{ cek2 = false; }
                            }catch(Exception e){
                                System.out.println("Input Salah!");
                                cek2 = true;
                            }
                        }while(cek2);
                        if(operasi == 1){ 
                            System.out.print("Masukkan Jari-jari : ");
                            int jari = Integer.parseInt(sc.nextLine());
                            Tabung tabung = new Tabung(jari);
                            tabung.ComputeAndSetVolume();
                            System.out.println("Hasil : " + tabung.GetVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            System.out.print("Masukkan Jari-jari : ");
                            int jari = Integer.parseInt(sc.nextLine());
                            System.out.print("Masukkan Tinggi : ");
                            int tinggi = Integer.parseInt(sc.nextLine());
                            Tabung tabung = new Tabung(jari, tinggi);
                            tabung.ComputeAndSetVolume();
                            System.out.println("Hasil : " + tabung.GetVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else{
                            Tabung tabung = new Tabung();
                            tabung.ComputeAndSetVolume();
                            System.out.println("Hasil : " + tabung.GetVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }
                        break;
                    case 4:
                        do{
                            System.out.print("Pilih Input \n1. Input Manual(jari-jari)\n2. Tanpa Input(default: 1)\nMasukkan Nomor : ");
                            try{
                                operasi = Integer.parseInt(sc.nextLine());
                                if(!(operasi >= 1 && operasi <= 2)){
                                    System.out.println("Pilihan Cuma 2");
                                    cek2 = true;
                                }else{ cek2 = false; }
                            }catch(Exception e){
                                System.out.println("Input Salah!");
                                cek2 = true;
                            }
                        }while(cek2);
                        if(operasi == 1){ 
                            System.out.print("Masukkan Jari-jari : ");
                            int jari = Integer.parseInt(sc.nextLine());
                            Bola bola = new Bola(jari);
                            bola.ComputeAndSetVolume();
                            System.out.println("Hasil : " + bola.GetVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            Bola bola = new Bola();
                            bola.ComputeAndSetVolume();
                            System.out.println("Hasil : " + bola.GetVolume());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }
                        break;
                    case 5:
                    do{
                        System.out.print("Pilihan Input \n1. Input Manual(sisi [other default: 1])\n2. Input Manual(sisi, tinggi)\n3. Tanpa Input(default: 1)\nMasukkan Nomor : ");
                        try{
                            operasi = Integer.parseInt(sc.nextLine());
                            if(!(operasi >= 1 && operasi <= 3)){
                                System.out.println("Pilihan Cuma 3");
                                cek2 = true;
                            }else{ cek2 = false; }
                        }catch(Exception e){
                            System.out.println("Input Salah!");
                            cek2 = true;
                        }
                    }while(cek2);
                    if(operasi == 1){ 
                        System.out.print("Masukkan Sisi : ");
                        int sisi = Integer.parseInt(sc.nextLine());
                        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat(sisi);
                        limasSegiEmpat.ComputeAndSetVolume();
                        System.out.println("Hasil : " + limasSegiEmpat.GetVolume());
                        System.out.print("Hitung Lagi? (y/n) : ");
                        String lagi = sc.nextLine();
                        if(lagi.equals("y")) cek = true;
                        else cek = false;
                    }else if(operasi == 2){
                        System.out.print("Masukkan sisi : ");
                        int sisi = Integer.parseInt(sc.nextLine());
                        System.out.print("Masukkan Tinggi : ");
                        int tinggi = Integer.parseInt(sc.nextLine());
                        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat(sisi, tinggi);
                        limasSegiEmpat.ComputeAndSetVolume();
                        System.out.println("Hasil : " + limasSegiEmpat.GetVolume());
                        System.out.print("Hitung Lagi? (y/n) : ");
                        String lagi = sc.nextLine();
                        if(lagi.equals("y")) cek = true;
                        else cek = false;
                    }else{
                        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat();
                        limasSegiEmpat.ComputeAndSetVolume();
                        System.out.println("Hasil : " + limasSegiEmpat.GetVolume());
                        System.out.print("Hitung Lagi? (y/n) : ");
                        String lagi = sc.nextLine();
                        if(lagi.equals("y")) cek = true;
                        else cek = false;
                    }
                        break;
                    default:
                        System.out.println("Pilihan Cuma 5");
                        cek = true;
                        break;
                }
            }catch(Exception e){
                System.out.println("Input Salah!");
                cek = true;
            }
        }while(cek);
        sc.close();
        System.out.println("========= Terima Kasih ===========");
    }
}
