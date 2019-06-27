package com.company;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class PlusMinus {
    static void plusMinus(int[] arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        int length = arr.length;

        for (int i = 0; i <= length -1; i++) {
            System.out.println("arr[i] = " + arr[i]);
            if (arr[i] > 0) {
                positive = positive +1;
            } else if (arr[i] < 0) {
                negative = negative +1;
            } else {
                zero = zero +1;
            }
        }

        NumberFormat formatter = new DecimalFormat("#0.000000");

        System.out.println(formatter.format(positive / length));
        System.out.println(formatter.format(negative / length));
        System.out.println(formatter.format(zero / length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n ; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);


        scanner.close();
    }
}
