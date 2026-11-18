
package org.example;

import java.util.Scanner;

public class SearchInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        inputArray(arr, scanner);

        System.out.println("Enter element to be searched: ");
        int target = scanner.nextInt();

        searchElement(arr, target);

        scanner.close();
    }


    public static void inputArray(int[] arr, Scanner scanner) {

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }


    public static void searchElement(int[] arr, int target) {

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
