package org.example;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        System.out.println("enter the elements of the array");

        for(int i = 0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        reverse(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
             start++;
             end--;
        }
    }
}
