package org.example;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        System.out.println("enter the elements of the array");

        for(int i = 0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("enter array where to be rotated");
        int d = scanner.nextInt();

        int start = 0;
        int end =arr.length;



        if(n == 0){
            return;
        }

        d= d % n;

        if(d==0){
            return;
        }



        rotate(arr,start,d-1);
        rotate(arr,d,end-1);
        rotate(arr,start,end-1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void rotate(int[] arr, int start ,int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
