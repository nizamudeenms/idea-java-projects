package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CutTheSticksSolution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }




        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {

            System.out.println("result = " + result[i]);
        }

        scanner.close();
    }


    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        int[] op = arr;

        for (int i = 0; i < arr.length; i++) {

            System.out.println("result = "+" I " + i +" " + arr[i]);
        }



        return op;

    }

}
