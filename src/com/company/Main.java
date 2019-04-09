package com.company;

import java.util.Scanner;

public class Main {


    private static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here
        System.out.println("Begin");

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int a : result) {
            System.out.println("a = " + a);
        }

        scan.close();
    }

    private static int[] gradingStudents(int[] grades) {


        int[] newGrades = new int[grades.length];
        System.out.println("Main.gradingStudents");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                int temp = ((grades[i] / 5) * 5) + 5;
                System.out.println("temp = " + temp);
                if ((temp-grades[i]) < 3) {
                    newGrades[i] = temp;
                }else{
                    newGrades[i] = grades[i];
                }
            } else {
                newGrades[i] = grades[i];
            }
        }

        return newGrades;
    }


}
