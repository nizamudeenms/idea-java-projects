package com.company;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String hr;
        String min;
        String sec;
        String type;
        String newTime = null;
        int hrs;

        hr = s.substring(0, 2);
        min = s.substring(3, 5);
        sec = s.substring(6, 8);
        type = s.substring(8, 10);

        if (type.equalsIgnoreCase("AM")) {
            if (hr.equals("12")) {
                newTime = "00" + ":" + min + ":" + sec;
            } else {
                newTime = hr + ":" + min + ":" + sec;
            }
        } else if (type.equalsIgnoreCase("PM")) {
            hrs = Integer.parseInt(hr) + 12;
            newTime =  (hr.equals("12") ? hr : hrs )+ ":" + min + ":" + sec;
        } else {
            System.out.println("Error Input");
        }


        return newTime;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);

//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
    }
}
