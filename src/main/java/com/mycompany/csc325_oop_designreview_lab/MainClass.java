/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass
{
    public static void main(String[] args)
    {
        // ToDo 5: Fix the error

        // ToDo 6: Fix the constructor of the Student class

        // Todo 7: Create two classes for Freshman and Senior

        // ToDo 8: The senior class should have a minimum of 85 credits

        // ToDo 9: Add a toString method for the Student class
        // ToDo 10: Add a toString method for the Freshman class

        Student std1= new Student("James", 20);
        // ToDo 11: Add a toString method for the Senior class

        std1 = new Freshman("James", 20, 12); // name, age, credits

        Student std2 = new Senior("John", 30, 90);

        // ToDo 12: Set the gpa of the student using the scanner and user
        // 			input and then print the output.
        Scanner scnr = new Scanner(System.in);
        //getting the gpa for both students
        System.out.println("Set student 1 gpa:");
        std1.setGpa( Float.valueOf( scnr.nextLine() ) );

        System.out.println("Set student 2 gpa:");
        std2.setGpa( Float.valueOf( scnr.nextLine() ) );

        scnr.close();

        System.out.println("Student 1:\n" + std1);

        System.out.println("Student 2:\n" + std2);

        // ToDo 13: add comments and explain your code

    }

}

