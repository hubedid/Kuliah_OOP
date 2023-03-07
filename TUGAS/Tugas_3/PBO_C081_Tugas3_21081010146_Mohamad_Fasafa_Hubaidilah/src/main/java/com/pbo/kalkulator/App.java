package com.pbo.kalkulator;
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
        System.out.println("========================= Kalkulator ===========================");
        Scanner sc = new Scanner(System.in);
        // boolean cek = false;
        Kalkulator kal = new Kalkulator();
        System.out.println("\tPisahkan operator dengan spasi");
        System.out.println("\tOperator : + , - , * , / , ()");
        System.out.println("\tContoh input : 1 + 2 * ( 3 - ( 4 / 3 ) ) * ( 10 - 3 )");
        System.out.println("================================================================");
        System.out.print("Masukkan\t: ");
        String inputan = sc.nextLine();
        System.out.println("Hasil\t\t: "+ kal.Hasil(inputan));
        sc.close();
    }
}
