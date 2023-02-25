package com.pbo.tugas2;
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
            System.out.print("Pilih Bangun \n1. Square\n2. Rectangle\n3. Circle\n4. Ellipse\nMasukkan Nomor : ");
            try{
                pilihan = Integer.parseInt(sc.nextLine());
                switch(pilihan){
                    case 1:
                        do{
                            System.out.print("Pilih Operasi \n1. Luas\n2. Keliling\nMasukkan Nomor : ");
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
                        System.out.print("Masukkan Sisi : ");
                        int sisi = Integer.parseInt(sc.nextLine());                    
                        Square square = new Square(sisi);
                        if(operasi == 1){ 
                            System.out.println(square.calculateArea());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            System.out.println(square.calculatePerimeter());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }
                        break;
                    case 2:
                        do{
                            System.out.print("Pilih Operasi \n1. Luas\n2. Keliling\nMasukkan Nomor : ");
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
                        System.out.print("Masukkan Panjang : ");
                        int panjang = Integer.parseInt(sc.nextLine());
                        System.out.print("Masukkan Lebar : ");
                        int lebar = Integer.parseInt(sc.nextLine());
                        Rectangle rectangle = new Rectangle(lebar, panjang);
                        if(operasi == 1){ 
                            System.out.println(rectangle.calculateArea());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            System.out.println(rectangle.calculatePerimeter());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }
                        break;
                    case 3:
                        do{
                            System.out.print("Pilih Operasi \n1. Luas\n2. Keliling\nMasukkan Nomor : ");
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
                        System.out.print("Masukkan Jari-jari : ");
                        int jari = Integer.parseInt(sc.nextLine());
                        Circle circle = new Circle(jari);
                        if(operasi == 1){ 
                            System.out.println(circle.calculateArea());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            System.out.println(circle.calculatePerimeter());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }
                        break;
                    case 4:
                        do{
                            System.out.print("Pilih Operasi \n1. Luas\n2. Keliling\nMasukkan Nomor : ");
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
                        System.out.print("Masukkan Sumbu Major : ");
                        int major = Integer.parseInt(sc.nextLine());
                        System.out.print("Masukkan Sumbu Minor : ");
                        int minor = Integer.parseInt(sc.nextLine());
                        Ellipse ellipse = new Ellipse(major, minor);
                        if(operasi == 1){ 
                            System.out.println(ellipse.calculateArea());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }else if(operasi == 2){
                            System.out.println(ellipse.calculatePerimeter());
                            System.out.print("Hitung Lagi? (y/n) : ");
                            String lagi = sc.nextLine();
                            if(lagi.equals("y")) cek = true;
                            else cek = false;
                        }
                        break;
                    default:
                        System.out.println("Pilihan Cuma 4");
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
