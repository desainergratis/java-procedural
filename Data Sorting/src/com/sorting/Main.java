package com.sorting;

import java.util.Arrays;

public class Main {

    static void ascendingFunct(int[] data) {
        for(int outter = 0; outter < data.length; outter++) {
            int temp;
            for(int inner = outter+1; inner < data.length; inner++ ) {
                if(data[outter] > data[inner]) {
                    temp = data[inner];
                    data[inner] = data[outter];
                    data[outter] = temp;
                    System.out.println("Outter : "+data[outter] + " Data inner : "+data[inner] + "\n");
                    System.out.println("Data : "+ Arrays.toString(data) + "\n");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] dataArray = {25,30,65,85,45,100,1,2,3,5,8};

        // Sort from unordered to ordered in a ascending
        ascendingFunct(dataArray);
        
    }
}