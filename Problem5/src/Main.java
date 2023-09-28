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
        Scanner input = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("#0.00");
        //Constants
        final double wholesalePercentage = 1.2;
        final int hourlyRate = 30;

        System.out.println("Welcome to the Remodeling Cost Calculator!");
        System.out.println("Please enter the projected number of hours for the job or 0 to end the program: ");
        double hours = input.nextDouble();
        if(hours == 0)
        {
            return;
        }
        else
        {
            input.nextLine();
            System.out.print("You entered " + hours + ". Is this correct? Please type 'yes' to continue: ");
            String yes = input.nextLine();
            while(!yes.equalsIgnoreCase("yes"))
            {
                System.out.println("Please enter the projected number of hours for the job: ");
                hours = input.nextDouble();
                input.nextLine();
                System.out.print("You entered " + hours + ". Is this correct? Please type 'yes' to continue: ");
                yes = input.nextLine();
            }
            double hourlyCost = hours * hourlyRate;
            System.out.print("Please enter the wholesale cost of materials for the job: ");
            double materialsCost = input.nextDouble();
            input.nextLine();
            System.out.println("You entered $" + materialsCost + ". Is this correct? Please type 'yes' to continue: ");
            yes = input.nextLine();
            while(!yes.equalsIgnoreCase("yes"))
            {
                System.out.print("Please enter the wholesale cost of materials for the job: ");
                materialsCost = input.nextDouble();
                input.nextLine();
                System.out.println("You entered $" + materialsCost + ". Is this correct? Please type 'yes' to continue: ");
                yes = input.nextLine();
            }
            input.close();
            double totalCost = (materialsCost * wholesalePercentage) + hourlyCost;
            System.out.println("The total cost for this project is $" + moneyFormat.format(totalCost));
        }
    }
}