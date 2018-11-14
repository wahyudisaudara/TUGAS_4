package com.company;

import java.util.ArrayList;

import static com.sun.javafx.fxml.expression.Expression.divide;

public class AlgoritmaMergeSort {

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
        AlgoritmaMergeSort ms = new AlgoritmaMergeSort(in);
        System.out.println("Angka yang di Input   : "+in.toString());
        for (Double i:ms.getSortedArray()){
            System.out.println(i+"");
        }
        ms.sortGivenArray();
        System.out.println("Angka yang di Input   : ");
        for (Double i:ms.getSortedArray()) {
            System.out.println(i);

        }

    }

    private  ArrayList<Double> inputArray;

    public ArrayList<Double> getSortedArray(){
        
        return  inputArray;
    }

    public AlgoritmaMergeSort(ArrayList<Double> inputArray) {
        this.inputArray = inputArray;
    }

    public void sortGivenArray(){
        divide(0, this.inputArray.size()-1);
    }

    public void  divide(int startIndex, int endIndex){
        if(startIndex<endIndex && (endIndex-startIndex)>=1){
            int mid = (endIndex + startIndex)/2;
            divide(startIndex, mid);
            divide(mid+1, endIndex);

            merger(startIndex,mid,endIndex);
        }
    }

    private void merger(int startIndex, int midIndex, int endIndex) {
        ArrayList<Double> mergedSortedArray = new ArrayList<>();
        int leftIndex = startIndex;
        int rightIndex = midIndex+1;

        while (leftIndex<=midIndex && rightIndex<=endIndex){
            if(inputArray.get(leftIndex)<=inputArray.get(leftIndex)){
                mergedSortedArray.add(inputArray.get(leftIndex));
                leftIndex++;
            }
        }

        while (leftIndex<=midIndex){
            mergedSortedArray.add(inputArray.get(leftIndex));
            leftIndex++;
        }
        while (rightIndex<=endIndex){
            mergedSortedArray.add(inputArray.get(rightIndex));
            rightIndex++;
        }
        int i = 0;
        int j = startIndex;

        while (i<mergedSortedArray.size()){
            inputArray.set(j, mergedSortedArray.get(i++));
            j++;
        }
    }
}