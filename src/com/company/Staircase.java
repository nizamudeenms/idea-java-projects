package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        int k = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");

                }
            }
            System.out.print("\n");

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}