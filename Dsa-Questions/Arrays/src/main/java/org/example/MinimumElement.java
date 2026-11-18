package org.example;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[10];
    int n = arr.length;
    int min = 0;

     System.out.println("Enter array elements: ");
     for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
    }

        for (int number : arr) {
        if(min > number){
            min = number;
        }
    }

        System.out.println(min);

        scanner.close();
  }
}
