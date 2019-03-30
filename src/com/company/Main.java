package com.company;

import java.util.Scanner;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here
        System.out.println("Begin");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);
        System.out.println("result = " + result);

        scanner.close();
    }

    private static int viralAdvertising(int n) {


        double shared = 5;
        double liked = 0;
        double cumulative = 0;
        double temp = 0;

        for (int i = 1; i <= n; i++) {
            liked = Math.floor(shared/2);
            cumulative = liked + cumulative;
            shared = liked * 3;

        }

        return (int) cumulative;
    }
}
