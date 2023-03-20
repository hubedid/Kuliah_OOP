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
        Object[] arrayObjectBangun = new Object[100];
        // arrayObjectBangun[0] = new Integer(1);
        int jumlahBangun = 0;
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
                            arrayObjectBangun[jumlahBangun] = new Kubus(sisi);
                            System.out.print("Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            arrayObjectBangun[jumlahBangun] = new Kubus();
                            System.out.print("Lagi? (y/n) : ");
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
                            arrayObjectBangun[jumlahBangun] = new Balok(panjang);
                            System.out.print("Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            System.out.print("Masukkan Panjang : ");
                            int panjang = Integer.parseInt(sc.nextLine());
                            System.out.print("Masukkan Lebar : ");
                            int lebar = Integer.parseInt(sc.nextLine());
                            arrayObjectBangun[jumlahBangun] = new Balok(panjang, lebar);
                            System.out.print("Lagi? (y/n) : ");
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
                            arrayObjectBangun[jumlahBangun] = new Balok(panjang, lebar, tinggi);
                            System.out.print("Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else{
                            arrayObjectBangun[jumlahBangun] = new Balok();
                            System.out.print("Lagi? (y/n) : ");
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
                            arrayObjectBangun[jumlahBangun] = new Tabung(jari);
                            System.out.print("Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            System.out.print("Masukkan Jari-jari : ");
                            int jari = Integer.parseInt(sc.nextLine());
                            System.out.print("Masukkan Tinggi : ");
                            int tinggi = Integer.parseInt(sc.nextLine());
                            arrayObjectBangun[jumlahBangun] = new Tabung(jari, tinggi);
                            System.out.print("Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else{
                            arrayObjectBangun[jumlahBangun] = new Tabung();
                            System.out.print("Lagi? (y/n) : ");
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
                            arrayObjectBangun[jumlahBangun] = new Bola(jari);
                            System.out.print("Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            arrayObjectBangun[jumlahBangun] = new Bola();
                            System.out.print("Lagi? (y/n) : ");
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
                            arrayObjectBangun[jumlahBangun] = new LimasSegiEmpat(sisi);
                            System.out.print("Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            System.out.print("Masukkan sisi : ");
                            int sisi = Integer.parseInt(sc.nextLine());
                            System.out.print("Masukkan Tinggi : ");
                            int tinggi = Integer.parseInt(sc.nextLine());
                            arrayObjectBangun[jumlahBangun] = new LimasSegiEmpat(sisi, tinggi);
                            System.out.print("Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else{
                            arrayObjectBangun[jumlahBangun] = new LimasSegiEmpat();
                            System.out.print("Lagi? (y/n) : ");
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
                jumlahBangun++;
            }catch(Exception e){
                System.out.println("Input Salah!");
                cek = true;
            }
        }while(cek);
        sc.close();
        System.out.println("================= Hasil ===================");
        
        
        // Tabung tabung = (Tabung)arrayObjectBangun[2];
        // Bola bola = (Bola)arrayObjectBangun[3];
        // LimasSegiEmpat limasSegiEmpat = (LimasSegiEmpat)arrayObjectBangun[4];
        double totalVolume = 0;
        int h = 1;
        for(Object bangun: arrayObjectBangun){
            if(bangun instanceof Kubus){
                Kubus kubus = (Kubus)bangun;
                System.out.print(h+". ");
                kubus.ComputeAndSetVolume();
                totalVolume += kubus.GetVolume();
            }else if(bangun instanceof Balok){
                Balok balok = (Balok)bangun;
                System.out.print(h+". ");
                balok.ComputeAndSetVolume();
                totalVolume += balok.GetVolume();
            }else if(bangun instanceof Tabung){
                Tabung tabung = (Tabung)bangun;
                System.out.print(h+". ");
                tabung.ComputeAndSetVolume();
                totalVolume += tabung.GetVolume();
            }else if(bangun instanceof Bola){
                Bola bola = (Bola)bangun;
                System.out.print(h+". ");
                bola.ComputeAndSetVolume();
                totalVolume += bola.GetVolume();
            }else if(bangun instanceof LimasSegiEmpat){
                LimasSegiEmpat limasSegiEmpat = (LimasSegiEmpat)bangun;
                System.out.print(h+". ");
                limasSegiEmpat.ComputeAndSetVolume();
                totalVolume += limasSegiEmpat.GetVolume();
            }
            h++;
        }
        double rata = totalVolume / 5;
        System.out.println("Rata-rata Volume : "+ rata);
        System.out.println("===========================================");
    }
}
