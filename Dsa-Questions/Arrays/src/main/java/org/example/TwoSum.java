package org.example;

import java.util.ArrayList;
import java.util.Arrays;


public class TwoSum {
    //using two pointer
    public static void main(String[] args) {
     int[] arr = {1, 3, 4, 6, 8, 11};
     int target  = 10;
        ArrayList<Integer> result  =twoSum(arr, target);
        System.out.println(result);
    }

    public static ArrayList<Integer>  twoSum (int[]arr, int target) {

        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                return new ArrayList<>(Arrays.asList(i+1,j+1));
            }else if(arr[i]+arr[j] <target){
                i++;
            }else {
                j--;
            }
        }

        return new ArrayList<>(Arrays.asList(-1,-1));
    }

}
