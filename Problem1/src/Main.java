/*
 * Name: [YOUR NAME HERE]
 * South Hills Username: [YOUR SOUTH HILLS USERNAME HERE]
 */
//Remember to put your name and SH username above

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat numberFormat = new DecimalFormat("#0.00");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Cubulator!");
        System.out.print("Please enter a value for the edge of a cube: ");
        double edge = input.nextDouble();
        System.out.print("You entered " + edge +". Is this correct? Please type 'yes' to continue: ");
        input.nextLine();
        String yes = input.nextLine();
        while(!yes.equalsIgnoreCase("yes"))
        {
            System.out.print("Please enter a value for the edge of a cube: ");
            edge = input.nextDouble();
            System.out.print("You entered " + edge +". Is this correct? Please type 'yes' to continue: ");
            input.nextLine();
            yes = input.nextLine();

        }
        input.close();
        System.out.println("The surface area for one side of this cube is " + numberFormat.format(edge * edge));
        System.out.println("The surface area for this cube is " + numberFormat.format((edge * edge) * 6));
        System.out.println("The volume for this cube is " + (numberFormat.format(edge * edge * edge)));

    }
}