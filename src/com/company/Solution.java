package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    static int[][] out;

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();

        out = new int[t][2];

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            lottery(n, tItr);
        }


        for (int i = 0; i < t; i++) {
            System.out.println("Case #" + i + ": " + out[i][0] + "\t" + out[i][1]);

        }
        System.out.print("\n");

        scanner.close();
    }

    private static void lottery(int n, int tItr) {


        if (n >= 4) {
            int[] intTab = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
            int[] t1 = new int[intTab.length];
            int[] t2 = new int[intTab.length];

            for (int i = 0; i < intTab.length; i++) {

                if (intTab[i] == 4) {
                    t1[i] = intTab[i] - 1;
                    t2[i] = 1;
                } else {
                    t1[i] = intTab[i];
                    t2[i] = 0;
                }


            }

            StringBuilder strNum = new StringBuilder();

            for (int num : t1) {
                strNum.append(num);
            }
            int val1 = Integer.parseInt(strNum.toString());


            StringBuilder strNum2 = new StringBuilder();

            for (int num2 : t2) {
                strNum2.append(num2);
            }
            int val2 = Integer.parseInt(strNum2.toString());
//            System.out.println(val1 + " " + val2);


            out[tItr][0] = val1;
            out[tItr][1] = val2;


        }

    }

}
