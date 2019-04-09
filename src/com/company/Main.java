package com.company;

import java.util.Scanner;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here
        System.out.println("Begin");

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            System.out.println("result = " + result);

        }


        scanner.close();
    }

    static int findDigits(int n) {

        int divs = 0;



        int[] digit = String.valueOf(n).chars().map(Character::getNumericValue).toArray();

        for (int i = 0; i < digit.length; i++) {
            if (digit[i] != 0) {
                System.out.println("n+\" \"+digit[i]+\" \"+n%digit[i] = " + n+" "+digit[i]+" "+n%digit[i]);
                if ((n % digit[i]) == 0) {
                    divs++;
                }
            }
        }
        return divs;
    }


}
