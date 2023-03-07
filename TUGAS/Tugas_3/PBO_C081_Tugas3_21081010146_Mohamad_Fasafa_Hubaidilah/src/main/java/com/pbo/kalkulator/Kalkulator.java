package com.pbo.kalkulator;
import java.util.ArrayList;
import java.util.Arrays;

public class Kalkulator {
    private double hasil;
    private double Penjumlahan(double angka1, double angka2){
        return angka1+angka2;
    }
    private double Pengurangan(double angka1, double angka2){
        return angka1-angka2;
    }
    private double Perkalian(double angka1, double angka2){
        return angka1*angka2;
    }
    private double Pembagian(double angka1, double angka2){
        return angka1/angka2;
    }
    private double hitungFinal(ArrayList<String> dataHitung){
        boolean a = true, op = true, b = true;
        double angka1 = 0.0, angka2 = 0.0;
        String operator = "";
        ArrayList<String> tempFinal = new ArrayList<String>();
        tempFinal.addAll(hitungKali(dataHitung));
        for(String s: tempFinal){
            // System.out.println(s + "sontol");
            if(a){
                angka1 = Double.parseDouble(s);
                a = false;
            }else if(op){
                // System.out.println("op " + s);
                operator = s;
                op = false;
            }else if(b){
                // System.out.println("b " + s);
                angka2 = Double.parseDouble(s);
                b = false;
            }
            if(!a && !op && !b){
                angka1 = hitungTambah(angka1, operator, angka2);
                op = true;
                b = true;
            }
        }
        return angka1;
    }
    private double hitungTambah(double angka1, String operator, double angka2){
        double hasil = 0;
        switch(operator){
            case "+":
                hasil = Penjumlahan(angka1, angka2);
                break;
            case "-":
                hasil = Pengurangan(angka1, angka2);
                break;
        }
        return hasil;
    }
    private ArrayList<String> hitungKali(ArrayList<String> dataHitung){
        ArrayList<String> tempFinal = new ArrayList<String>();
        tempFinal.addAll(dataHitung);
        int legth = tempFinal.size();
        for(int i = 0; i < legth; i++){
            if(tempFinal.get(i).equals("*")){
                tempFinal.set(i, Double.toString(Perkalian(Double.parseDouble(tempFinal.get(i-1)), Double.parseDouble(tempFinal.get(i+1)))));
                tempFinal.remove(i+1);
                tempFinal.remove(i-1);
                legth -= 2;
            }
            // if(tempFinal.get(i).equals("/")){
            //     tempFinal.set(i, Double.toString(Pembagian(Double.parseDouble(tempFinal.get(i-1)), Double.parseDouble(tempFinal.get(i+1)))));
            //     tempFinal.remove(i+1);
            //     tempFinal.remove(i-1);
            //     legth -= 2;
            // }
        }
        for(int i = 0; i < legth; i++){
            if(tempFinal.get(i).equals("/")){
                tempFinal.set(i, Double.toString(Pembagian(Double.parseDouble(tempFinal.get(i-1)), Double.parseDouble(tempFinal.get(i+1)))));
                tempFinal.remove(i+1);
                tempFinal.remove(i-1);
                legth -= 2;
            }
        }
        // ArrayList<String> operatorList = new ArrayList<String>();
        // Pattern p = Pattern.compile("\\D");

        // for (String s: dataHitung) {
        //     if (p.matcher(s).matches()) {
        //         operatorList.add(s);
        //     }
        // }
        // System.out.println(tempFinal);
        return tempFinal;
    }
    private ArrayList<String> hitungKurung(ArrayList<String> listInput){
        ArrayList<String> dalam = new ArrayList<String>();
        ArrayList<String> finall = new ArrayList<String>();
        ArrayList<String> tempDalam = new ArrayList<String>();
        ArrayList<String> tempFinal = new ArrayList<String>();
        ArrayList<String> hampirFinal = new ArrayList<String>();
        int kurung1 = listInput.indexOf("(");
        int kurung2 = listInput.indexOf(")");
        int jk1 = 0, jk2 = 0;
        for(int i = 0; i < listInput.size(); i++){
            if(listInput.get(i).equals("(")){
                jk1++;
            }
            
            if(jk1 > 1){
                if(listInput.get(i).equals(")")){
                    jk2++;
                    kurung2 = i;
                    if(jk2 > 1) break;
                }   
            }
        }
        for(int i = kurung1+1; i < kurung2; i++){
            dalam.add(listInput.get(i));
        }
        // System.out.println(dalam);
        // System.out.println(kurung1);
        for(int i = 0; i < listInput.size(); i++){
            if(i == kurung1) tempFinal.add("tempatDalam");
            if(!(i >= kurung1 && i <= kurung2)){
                tempFinal.add(listInput.get(i));
            }
        }
        if(isKurung(dalam)){
            tempDalam.addAll(hitungKurung(dalam));
            double hasilDalam = hitungFinal(hitungKali(tempDalam));
            int indexTempat = tempFinal.indexOf("tempatDalam");
            tempFinal.set(indexTempat, Double.toString(hasilDalam));
        }else{
            double hasilDalam = hitungFinal(hitungKali(dalam));
            int indexTempat = tempFinal.indexOf("tempatDalam");
            tempFinal.set(indexTempat, Double.toString(hasilDalam));
        }

        if(isKurung(tempFinal)){
            finall.addAll(hitungKurung(tempFinal));
            // System.out.println(hitungKurung(tempFinal));
            // double hasilDalam = hitungFinal(hitungKali(hampirFinal));
            // int indexTempat = tempFinal.indexOf("tempatDalam");
            // tempFinal.set(indexTempat, Double.toString(hasilDalam));
        }else{
            finall.addAll(tempFinal);
        }
        // finall.addAll(kurungHoaks(tempFinal));
        return finall;
    }
    // private ArrayList<String> kurungHoaks(ArrayList<String> hoaks){
    //     ArrayList<String> finall = new ArrayList<String>();
    //     if(isKurung(hoaks)){
    //         finall.removeAll(finall);
    //         finall.addAll(hitungKurung(hoaks));
    //         // System.out.println(hitungKurung(tempFinal));
    //         // double hasilDalam = hitungFinal(hitungKali(hampirFinal));
    //         // int indexTempat = tempFinal.indexOf("tempatDalam");
    //         // tempFinal.set(indexTempat, Double.toString(hasilDalam));
    //     }else{
    //         finall.addAll(hoaks);
    //     }
    //     return finall;
    // }
    private boolean isKurung(ArrayList<String> listInput){
        return (listInput.indexOf("(") != -1) ? true : false;
    }
    // private int banyakKurung(ArrayList<String> listInput){
    //     //  (listInput.indexOf("(") != -1) ? true : false;
    //     int jumlahKurung = 0;
    //     for(String s: listInput){
    //         if(s.indexOf("(") != -1){
    //             jumlahKurung++;
    //         }
    //     }
    //     return jumlahKurung;
    // }
    public double Hasil(String inputan){
        String[] splitInputan = inputan.split(" ");
        ArrayList<String> listInput = new ArrayList<String>(Arrays.asList(splitInputan));
        ArrayList<String> temp = new ArrayList<String>();
        if(isKurung(listInput)){
            temp.addAll(hitungKurung(listInput));
            // System.out.println(temp);
            this.hasil = hitungFinal(hitungKali(temp));
        }else{
            this.hasil = hitungFinal(hitungKali(listInput));
        }
        // System.out.println(hitungKurung(listInput));
        return this.hasil;

    }   
}
