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

    static int[] separeteArray(int[] data, int[] ascendingData) {

        // fill descending Array with ascending data
        // Separate to make sure the array address different
        for(int index = 0; index < data.length; index++) {
                    data[index] = ascendingData[index];

        }
        return data;
    }

    static void descendingFunct(int[] data) {

        for(int index = 0; index < data.length / 2; index++) {
            int temp;
            // If first data < last data
            if(data[index] < data[(data.length - 1) - index]){
                // then swap
                temp = data[(data.length - 1) - index];
                data[(data.length - 1) - index] = data[index];
                data[index] = temp;
            }
        }
        System.out.println("Descending : "+ Arrays.toString(data));
    }


    public static void main(String[] args) {
        int[] dataArray = {25,30,65,85,45,100,1,2,3,5,8};
        int[] descendingArray = new int[dataArray.length];
    
        // Sort from unordered to ordered in a ascending
        ascendingFunct(dataArray);

        // Separate array
        separeteArray(descendingArray,dataArray);

        // Sort to descending ways
        descendingFunct(descendingArray);
      
        
        
        
       
        
    }
}