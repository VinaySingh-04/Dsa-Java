package org.example;


public class App {
    public static void main( String[] args ) {
        int n = 5;
//        for(int i = 1;i<=n;i++){
//            char ch = (char) ('A' + i-1);
//            for (int j = 1;j<=i;j++){
//                System.out.print(ch +" ");
//            }
//            System.out.println();
//        }

        // Another And Simple Way To Solve This Pattern

        char ch = 'A';
        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(ch +" ");
            }
            ch++;
            System.out.println();
        }
    }
}
