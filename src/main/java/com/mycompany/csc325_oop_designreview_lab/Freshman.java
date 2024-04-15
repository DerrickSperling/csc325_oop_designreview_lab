package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student
{
    private int credits;

    //parameterized constructor
    public Freshman(String name, int age, int theCredits)
    {
        super(name, age);
        credits = theCredits;
    }

    public String toString()
    {
        return super.toString() + "\nGpa: " + gpa + "\nCredits: " + credits;
    }
}
