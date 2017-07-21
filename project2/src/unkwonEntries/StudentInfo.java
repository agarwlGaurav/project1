package unkwonEntries;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by dhavald832gmail.com on 13-06-2017.
 */
public class StudentInfo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
//        System.out.println("How many Student data do you want to enter?");
//        int n = s1.nextInt();
//        System.out.println("Enter the " + n + " Student information  : ");

        ArrayList<String> arrayofnames = new ArrayList<String>();
        ArrayList<String> section = new ArrayList<String>();
        ArrayList<Integer> marks = new ArrayList<Integer>();
        ArrayList<Long> mobilenumber = new ArrayList<Long>();
        int j = 1;
        int i = 0;
        do {
            System.out.println("Enter name of student  " + (i + 1));
            arrayofnames.add(s1.next());
            System.out.println("Enter section of student  " + (i + 1));
            section.add(s1.next());
            System.out.println("Enter mark of student  " + (i + 1));
            marks.add(s1.nextInt());
            System.out.println("Enter mobile number of student  " + (i + 1));
            mobilenumber.add(s1.nextLong());
            System.out.println("\n");
            i++;
            System.out.println("Do you want to enter another record. Press 1 for yes ");
            j = s1.nextInt();
        } while (j == 1);


        System.out.println("DO you want to print the information stored. Press 1 for yes");
        int x = s1.nextInt();

        if (x == 1) {
            System.out.println("\n");
            for (int m = 0; m < i; m++) {
                System.out.println("Name of student  " + (m + 1));
                System.out.println(arrayofnames.get(m));
                System.out.println("Section of student  " + (m + 1));
                System.out.println(section.get(m));
                System.out.println("Marks of student  " + (m + 1));
                System.out.println(marks.get(m));
                System.out.println("Phone number of student  " + (m + 1));
                System.out.println(mobilenumber.get(m) + "\n");
            }
        }

    }
}
