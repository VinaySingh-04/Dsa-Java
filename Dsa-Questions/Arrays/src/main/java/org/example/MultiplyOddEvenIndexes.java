package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyOddEvenIndexes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int n = arr.length;

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] *= 10;
            } else {
                arr[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arr));

        scanner.close();
    }
}
