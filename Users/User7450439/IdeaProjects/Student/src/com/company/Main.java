package com.company;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static com.company.Student1.StName;

public class Main {



    public static void main(String[] args) {
        // write your code here
        List<Student1> Students = new ArrayList<Student1>();

        Students.add(new Student1("Vasia", 2));
        Students.add(new Student1("Petya", 3));
        Students.add(new Student1("Mashsa", 4));
        Students.add(new Student1("Kolya", 1));
        Students.add(new Student1("Viola", 5));
        Students.add(new Student1("Vika", 2));
        Students.add(new Student1("Zhenya", 4));
        Students.add(new Student1("Valya", 3));



        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print ("Enter course number ");
            n = sc.nextInt();



        for (Iterator iter = Students.iterator(); iter.hasNext();){
            Student1 element = (Student1) iter.next();
                if (n==Student1.Course)
                    System.out.println (Student1.StName);


        }




    }



    private static String printStudent1() {
        return StName;
    }

}

