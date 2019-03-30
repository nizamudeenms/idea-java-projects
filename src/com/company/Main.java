package com.company;

import java.util.Scanner;

public class Main {

    static int beautifulDays(int i, int j, int k) {
        int bday = 0;
        int diff = 0;


        for (int l = i; l <= j; l++) {
//            System.out.println("l = " + l);
            int reversed = 0;
            int number = l;

            while (number != 0) {
                reversed = (reversed * 10) + (number % 10);
                number = number / 10;
            }
//            System.out.println("reversed = " + reversed);

            diff = l - reversed;
//            System.out.println("diff = " + diff);

            if (diff % k == 0) {
                bday++;
            }
//            System.out.println("bday = " + bday);

            StringBuilder temp = new StringBuilder();
//            temp.append(l);
//            temp=temp.reverse();
//            String temp1 = temp.toString();
//            int aRev = Integer.parseInt(temp1);
//            if(Math.abs((l-aRev)%k)==0){
//                bday++;
//            }



        }


        return bday;

    }


    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here
        System.out.println("Begin");

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        int result = beautifulDays(i, j, k);


        System.out.println("result = " + result);
    }
}
