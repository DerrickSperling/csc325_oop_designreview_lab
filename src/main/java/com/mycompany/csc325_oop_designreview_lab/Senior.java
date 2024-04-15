package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student
{
    private int credits;

    public Senior(String name, int age, int theCredits)
    {
        super(name, age);
        if(theCredits < 84)
        {
            throw new IllegalArgumentException("Student does not have enough credits to be a senior");
        }
        credits = theCredits;
    }

    public String toString()
    {
        return super.toString() + "\nGpa: " + gpa + "\nCredits: " + credits;
    }
}
