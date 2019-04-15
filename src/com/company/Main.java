package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {





//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] input = {3, 2, 5, 6};
        mini(input);
        System.out.println("least : " + mini(input));
//        scanner.close();
    }

//    static void extraLongFactorials(int n) {
//        BigInteger bigI = new BigInteger("1");
//        BigInteger bigT = new BigInteger("0");
//
//        for (int i = 1; i <=n ; i++) {
//            bigT = BigInteger.valueOf(i);
//            bigI = bigI.multiply(bigT);
//        }
//        System.out.println("bigI = " + bigI);
//
//    }



    private static int mini(int[] input) {
        int temp = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] < temp) {
                temp = input[i];
            }
        }

        return temp;
    }
}
