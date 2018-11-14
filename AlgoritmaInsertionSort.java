package com.company;

import java.util.ArrayList;

public class AlgoritmaInsertionSort {

    public static void main(String[] args) {
        ArrayList<Double> in 	= new ArrayList<Double>();
        in.add(11.9);
        in.add(1.6);
        in.add(7.67);
        in.add(2.09);
        in.add(17.0);
        in.add(6.99);
        in.add(5.76);
        in.add(13.3);
        in.add(15.4);
        in.add(8.1);
        System.out.println("Angka yang di Input   : "+in.toString());

        ArrayList<Double> out	= sort(in);
        System.out.println("********************** Hasil Akhir Sorting ***************************");
        System.out.println("Hasil Sorting: "+out.toString());

    }

    public static ArrayList<Double>sort(ArrayList<Double> data){

        int n	= data.size();
        Double key;
        int j;
        double temp;
        for (int i = 1; i <n ; i++) {
            key = data.get(i);
            j = i-1;
            while (j>=0 && key < data.get(j)){
                temp = data.get(j);
                data.set(j, data.get(j+1));
                data.set(j+1, temp);
                j--;
            }
            System.out.println(data.toString());

        }
        return data;
    }
}
