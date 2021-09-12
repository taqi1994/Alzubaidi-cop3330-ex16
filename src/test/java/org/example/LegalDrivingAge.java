/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


import java.util.*;

public class LegalDrivingAge
{
    public static void main (String[] args)
    {
    int age;

    Scanner reader = new Scanner (System.in);

    System.out.print("What is your age? ");
    age = reader.nextInt();

        if ( age >= 16 )
            System.out.println("You are old enough to legally drive.");

        else if ( age < 0 )
            System.out.println("Please enter a valid age.");

        //Oherwise, will be illegally to drive
        else
            System.out.println("You are not old enough to legally drive.");
    }
}