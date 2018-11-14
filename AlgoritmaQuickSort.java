package com.company;
import java.util.ArrayList;

public class AlgoritmaQuickSort {
    public static void main(String[] args) {

        ArrayList<Double> in = new ArrayList<Double>();
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


    public static ArrayList<Double> sort(ArrayList<Double> in) {

        if (in.size() <= 1) {
            return in;
        }

        Double pivot = in.get(0);
        ArrayList<Double> left = new ArrayList<Double>();
        ArrayList<Double> right = new ArrayList<Double>();

        for (int i = 1; i < in.size(); i++) {
            if (in.get(i) < pivot) {
                left.add(in.get(i));
                //System.out.println(left);
            } else {
                right.add(in.get(i));
            }

        }
        return join(sort(left), sort(right), pivot);
    }

    public static ArrayList<Double> join(ArrayList<Double> left, ArrayList<Double> right, Double pivot) {

        ArrayList<Double> in = new ArrayList<Double>();

        for (int i = 0; i < left.size(); i++) {
            in.add(left.get(i));
        }

        in.add(pivot);

        for (int i = 0; i < right.size(); i++) {
            in.add(right.get(i));
        }
        return in;

    }
}