package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 22 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter the first number: ");
        String stringOne = scan.nextLine();
        System.out.print( "Enter the second number: ");
        String stringTwo = scan.nextLine();
        System.out.print( "Enter the third number: ");
        String stringThree = scan.nextLine();

        int one = Integer.parseInt(stringOne);
        int two = Integer.parseInt(stringTwo);
        int three = Integer.parseInt(stringThree);

        if(one == two || two == three || one == three)
        {
            System.out.print( "The numbers you entered were not all unique");
            return;
        }
        else if(one > two && one > three)
        {
            System.out.print( "The largest number is "+one+".");
        }
        else if(two > one && two > three)
        {
            System.out.print( "The largest number is "+two+".");
        }
        else if(three > one && three > two)
        {
            System.out.print( "The largest number is "+three+".");
        }
    }
}