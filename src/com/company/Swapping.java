package com.company;

import java.util.Arrays;

public class Swapping {

    public static void main(String[] args) {
        int [] arr = {12,3,4,12,4,6,21,5,6,2};
       //{2, 3, 4, 4, 5, 6, 6, 12, 12, 21};
       System.out.println(Arrays.toString(sort(arr)));
        int x = 6;  // x = 7 and y = 6
        int y = 7;
        int hold = x;
        x = y;
        y = hold;
//        x = y;
//        y = hold;
        System.out.println(x);
        System.out.println(y);
        // x= 7 and y = 7;
    }

    public static int[] sort(int[] arr) {
       for(int i = 0; i < arr.length; i++) {
           for(int j = i+1; j < arr.length; j++){
               if(arr[i] > arr[j]){
                   int hold = arr[i];
                   arr[i] = arr[j];
                   arr[j] = hold;
               }
           }
       }
//        {21,12,12,6,6,5,4,4,3,2}
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] < arr[i + 1]) {
                int hold = arr[i]; //hold = 3;
                arr[i] = arr[i + 1]; // arr[i] = 4;
                arr[i + 1] = hold; //arr[i+1] = 3;
                i = -1;
            }
        }


        return arr;
    }
}