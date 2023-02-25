package com.pbo;

import java.util.Scanner;
/**
 * Hello world!
 *
 */

public class App {
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String nama, alamat;
        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = sc.nextLine();
        Gaji dataGaji = new Gaji(nama, alamat);
        Karyawan dataKaryawan = dataGaji.hitungGaji();
        System.out.println("============ Hasil =============");
        System.out.println("Nama : "+ dataKaryawan.getNama() + "\nAlamat : " + dataKaryawan.getAlamat() + "\nDepartemen : " + dataKaryawan.getDepartemen() + "\nPengalaman : " + dataKaryawan.getPengalaman() + "\nSkill : " + dataKaryawan.getSkill() + "\nGaji : " + dataKaryawan.getGaji() );
        System.out.println("================================");
        sc.close();
    }
}

