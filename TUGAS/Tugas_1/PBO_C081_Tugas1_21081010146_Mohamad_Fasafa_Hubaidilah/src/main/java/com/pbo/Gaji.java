package com.pbo;
import java.util.Scanner;

public class Gaji {
    // Attribut
    Scanner sc = new Scanner(System.in);
    int departemen, pengalaman, skill;
    long gaji = 0;
    Karyawan dataKaryawan = new Karyawan();
    // Constructor
    public Gaji(String nama, String alamat){
        this.dataKaryawan.setNama(nama);
        this.dataKaryawan.setAlamat(alamat);
        System.out.print("Pilih Departemen : \n1. IT\n2. HRD\n3. Finance\nMasukkan Angka : ");
        this.departemen = this.sc.nextInt();
        switch (this.departemen){
            case 1:
                this.dataKaryawan.setDepartemen("IT");
                break;
            case 2:
                this.dataKaryawan.setDepartemen("HRD");
                break;
            case 3:
                this.dataKaryawan.setDepartemen("Finance");
                break;
            default:
                System.out.println("Input Salah");
        }
        System.out.print("Pilih Pengalaman : \n1. Pemula\n2. Menengah\n3. Expert\nMasukkan Angka : ");
        this.pengalaman = this.sc.nextInt();
        switch (this.pengalaman){
            case 1:
                this.dataKaryawan.setPengalaman("Pemula");
                break;
            case 2:
                this.dataKaryawan.setPengalaman("Menengah");
                break;
            case 3:
                this.dataKaryawan.setPengalaman("Expert");
                break;
            default:
                System.out.println("Input Salah");
        }
        System.out.print("Pilih Skill : \n1. Website\n2. Mobile\n3. Desktop\nMasukkan Angka : ");
        this.skill = this.sc.nextInt();
        switch (this.skill){
            case 1:
                this.dataKaryawan.setSkill("Website");
                break;
            case 2:
                this.dataKaryawan.setSkill("Mobile");
                break;
            case 3:
                this.dataKaryawan.setSkill("Desktop");
                break;
            default:
                System.out.println("Input Salah");
        }
    }
    // Method
    public Karyawan hitungGaji(){
        switch (this.dataKaryawan.getDepartemen()){
            case "IT":
                this.gaji += 8000000;
                break;
            case "HRD":
                this.gaji += 5000000;
                break;
            case "Finance":
                this.gaji += 4000000;
                break;
            default:
                System.out.println("Input Salah");
        }
        switch (this.dataKaryawan.getPengalaman()){
            case "Pemula":
                this.gaji += 500000;
                break;
            case "Menengah":
                this.gaji += 1000000;
                break;
            case "Expert":
                this.gaji += 2000000;
                break;
            default:
                System.out.println("Input Salah");
        }
        switch (this.dataKaryawan.getSkill()){
            case "Website":
                this.gaji += 1000000;
                break;
            case "Mobile":
                this.gaji += 2000000;
                break;
            case "Desktop":
                this.gaji += 2500000;
                break;
            default:
                System.out.println("Input Salah");
        }
        this.dataKaryawan.setGaji(this.gaji);
        return this.dataKaryawan;
    }
}
