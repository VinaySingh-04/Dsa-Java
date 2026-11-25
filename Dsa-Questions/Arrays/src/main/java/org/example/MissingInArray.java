package org.example;



import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        System.out.println("enter the elements of the array");

        for(int i = 0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

       int missingNumber = findMissingNumber(arr);
        System.out.println(missingNumber);

    }

    public static int findMissingNumber(int[] arr){
        long n = arr.length+1;
        long totalSum = (n*(n+1))/2;

        long actualSum = 0;
        for(int i = 0;i<arr.length;i++){
            actualSum += arr[i];
        }

        return (int)(totalSum - actualSum);
    }
}
