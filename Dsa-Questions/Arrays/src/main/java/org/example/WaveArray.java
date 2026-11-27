package org.example;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Example
//        int[] arr= {2,4,7,8,9};
        System.out.println("enter the size of the array");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elements of the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

            waveArray(arr);

            for (int j : arr) {
                System.out.print(j + " ");
            }

        }


    public static void waveArray(int[] arr){
        for(int i = 0;i<arr.length;i+=2){
            int j= i+1;

            if(i == arr.length-1 ){
                return;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
