package com.company;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DesignerPDFViewer {


    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {

        System.out.println("word = " + word);
        int max = 0;
        int charPosition = 0;
        int tempVal = 0;

        char[] ch = word.toCharArray();
        for (char c : ch) {
            int temp = (int) c;
            int temp_integer = 96; //for lower case
            if (temp <= 122 & temp >= 97) {
                charPosition = temp - temp_integer;
                System.out.println(charPosition);
                tempVal = h[charPosition - 1];
                max = max > tempVal ? max : tempVal;
            }
        }
        return max*word.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);


        System.out.println("result = " + result);

        scanner.close();
    }
}
