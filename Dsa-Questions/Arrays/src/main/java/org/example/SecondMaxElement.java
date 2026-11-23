package org.example;

import java.util.Scanner;

public class SecondMaxElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = find(arr);
        System.out.println(result);

        scanner.close();
    }

    public static int find(int[] arr) {

        if (arr.length < 2) {
            return -1;
        }

        int max = arr[0];
        int secMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {

                secMax = max;
                max = arr[i];

            } else if (arr[i] < max && arr[i] > secMax) {

                secMax = arr[i];
            }
        }

        if (secMax == Integer.MIN_VALUE) {
            return -1;
        }

        return secMax;
    }
}