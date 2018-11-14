package com.company;

import java.util.ArrayList;

public class AlgoritmaShellSort {


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
        int  d = 1;
        int j;
        while (9*d<n){
            d = 3*d + 1;
        }
        while (d > 0){
            for (int i = d; i <n ; i++) {
                Double ai = data.get(i);
                j = i;
                while (j>= d && data.get(j-d)> ai){
                    data.set(j, data.get(j-d));
                    j -= d;
                }
                data.set(j, ai);
            }
            d /= 3;
        }
        return data;
    }
}
