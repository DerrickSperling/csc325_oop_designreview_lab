/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human
{
    protected float gpa;

    public Student(String name, int age)
    {
        super(name, (short) age);
    }

    //getter method for address
    @Override
    public String getAddress()
    {
        return address;
    }

    //setter method for address
    @Override
    public void setAddress(String nAddress)
    {
        address = nAddress;
    }

    //getter method for gpa
    public float getGpa()
    {
        return gpa;
    }

    //setter method for gpa
    public void setGpa(float nGpa)
    {
        gpa = nGpa;
    }

    public String toString()
    {
        return "Name: " + name + "\nAge: " + age;
    }
    // ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
}
