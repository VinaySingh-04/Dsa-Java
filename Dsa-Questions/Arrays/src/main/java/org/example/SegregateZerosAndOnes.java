package org.example;

import java.util.Scanner;

public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        // example
       //  int[] arr = {0,1,1,0,1,0,1,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        System.out.println("enter the elements of the array");

        for(int i = 0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        segregate(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    public static void segregate(int[] arr){
        int countZeros = 0;
        int countOnes = 0;

        for (int j : arr) {
            if (j == 0) {
                countZeros++;
            } else if (j == 1) {
                countOnes++;
            }
        }

        for(int i = 0;i<countZeros;i++){
            arr[i] = 0;
        }

        for(int i = countZeros;i<arr.length;i++){
            arr[i] = 1;
        }
    }
}
