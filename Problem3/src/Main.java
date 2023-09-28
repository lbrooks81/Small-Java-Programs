/*
 * Name: [YOUR NAME HERE]
 * South Hills Username: [YOUR SOUTH HILLS USERNAME HERE]
 */
//Remember to put your name and SH username above

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("So you want to know if it's a leap year? Well you've come to the right place!");
        System.out.print("Enter the year and we'll tell you if it's a leap year: ");
        int year = input.nextInt();
        input.close();
        if(year % 4 == 0)
        {
            System.out.println("It's a leap year! Huzzah!");
        }
        else
        {
            System.out.println("It's not a leap year <:( ");
        }
    }
}