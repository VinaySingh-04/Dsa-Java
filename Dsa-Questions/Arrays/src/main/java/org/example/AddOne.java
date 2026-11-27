package org.example;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class AddOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Example
//        int[] arr= {9,9,9,9};
        System.out.println("enter the size of the array");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elements of the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        ArrayList<Integer> answer =  addOne(arr);
        System.out.println(answer);



      }

      public static ArrayList<Integer> addOne(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length-1;
        int carry = 1;

        for(int i = n;i>=0;i--){
            if (arr[i] + carry <= 9) {
                result.add(arr[i] + carry);
                carry = 0;
            }else {
                result.add(0);
                carry = 1;
            }
        }
        if(carry == 1){
            result.add(1);
        }
        Collections.reverse(result);
        return result;
      }
    }

