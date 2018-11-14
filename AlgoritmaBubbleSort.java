package com.company;

import java.util.ArrayList;

public class AlgoritmaBubbleSort {
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
        double temp;
        if(n>1){
            for (int x = 0; x <n ; x++) {
                for (int i = 0; i <n-1 ; i++) {
                    if(data.get(i).compareTo(data.get(i+1))>0){
                        temp = data.get(i);
                        data.set(i, data.get(i+1));
                        data.set(i+1, temp);
                    }
                }
                System.out.println(data.toString());


            }
        }
        return data;
    }

}
