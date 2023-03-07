package com.pbo.kalkulator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

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
            if(a){
                angka1 = Double.parseDouble(s);
                a = false;
            }else if(op){
                operator = s;
                op = false;
            }else if(b){
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
        for(int i = 0; i < tempFinal.size(); i++){
            if(tempFinal.get(i).equals("*")){
                tempFinal.set(i, Double.toString(Perkalian(Double.parseDouble(tempFinal.get(i-1)), Double.parseDouble(tempFinal.get(i+1)))));
                tempFinal.remove(i+1);
                tempFinal.remove(i-1);
            }
        }
        for(int i = 0; i < tempFinal.size(); i++){
            if(tempFinal.get(i).equals("/")){
                tempFinal.set(i, Double.toString(Pembagian(Double.parseDouble(tempFinal.get(i-1)), Double.parseDouble(tempFinal.get(i+1)))));
                tempFinal.remove(i+1);
                tempFinal.remove(i-1);
            }
        }
        return tempFinal;
    }
    private int cariTutupKurung(ArrayList<String> expression, int index) {
        int i;
        int indexFinal = 0;
        if (!(expression.get(index).equals("("))) {
            indexFinal = -1;
            return indexFinal;
        }
        Stack<Integer> st = new Stack<>();
        for (i = index; i < expression.size(); i++) {
            if (expression.get(i).equals("(")) {
                st.push((int) expression.get(i).charAt(0));
            }
            else if (expression.get(i).equals(")")) {
                st.pop();
                if (st.empty()) {
                    indexFinal = i;
                    return indexFinal;
                }
            }
        }
        indexFinal = -1;
        return indexFinal;
    }
    private ArrayList<String> hitungKurung(ArrayList<String> listInput){
        ArrayList<String> dalam = new ArrayList<String>();
        ArrayList<String> finall = new ArrayList<String>();
        ArrayList<String> tempDalam = new ArrayList<String>();
        ArrayList<String> tempFinal = new ArrayList<String>();
        int kurung1 = listInput.indexOf("(");
        int kurung2 = cariTutupKurung(listInput, kurung1);
        for(int i = kurung1+1; i < kurung2; i++){
            dalam.add(listInput.get(i));
        }
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
        }else{
            finall.addAll(tempFinal);
        }
        return finall;
    }
    private boolean isKurung(ArrayList<String> listInput){
        return (listInput.indexOf("(") != -1) ? true : false;
    }
    public double Hasil(String inputan){
        String[] splitInputan = inputan.split(" ");
        ArrayList<String> listInput = new ArrayList<String>(Arrays.asList(splitInputan));
        ArrayList<String> temp = new ArrayList<String>();
        if(isKurung(listInput)){
            temp.addAll(hitungKurung(listInput));
            this.hasil = hitungFinal(hitungKali(temp));
        }else{
            this.hasil = hitungFinal(hitungKali(listInput));
        }
        return this.hasil;

    }   
}
