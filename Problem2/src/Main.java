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

        //Constants
        final double aThreshold = 90;
        final double bThreshold = 80;
        final double cThreshold = 70;
        final double dThreshold = 60;

        System.out.println("Welcome to the gradulator!");
        System.out.print("Please enter your score: ");
        double score = input.nextDouble();
        input.close();
        if(score >= aThreshold)
        {
            System.out.println("You got an A! Good job!");
        }
        else if(score >= bThreshold)
        {
            System.out.println("You got a B! Pretty good.");
        }
        else if(score >= cThreshold)
        {
            System.out.println("You got a C. Not so great.");
        }
        else if(score >= dThreshold)
        {
            System.out.println("You got a D. Step it up!");
        }
        else
        {
            System.out.println("You got an F. Get it together!");
        }
    }
}