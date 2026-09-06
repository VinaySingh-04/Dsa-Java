package org.example;

public class App {
    public static void main( String[] args ) {
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<i-1;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=(11-(2*i));j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second way
        int n = 5;
        for(int i = 1;i<=5;i++){
            for (int j = 1;j<= i-1;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<= 2*(n-i)+1;j++ ){
                System.out.print("*");

                //   2 * (n-i)+1 or 2 * (5-i)+1  both work same
            }
            System.out.println();
        }
    }

}
