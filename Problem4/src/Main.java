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
        final double prizeThreshold = 1399.99;
        double total = 0;
        while(prizeThreshold > total)
        {
            System.out.print("Please enter the price of the item: ");
            double price = input.nextDouble();
            System.out.print("You entered $" + price + ". Please type 'yes' if this is correct: ");
            input.nextLine();
            String yes = input.nextLine();
            while(!yes.equalsIgnoreCase("yes"))
            {
                System.out.print("Please enter the price of the item: ");
                price = input.nextDouble();
                System.out.print("You entered $" + price + ". Please type 'yes' if this is correct: ");
                input.nextLine();
                yes = input.nextLine();
            }
            System.out.print("Please enter the name of the item: ");
            String itemType = input.nextLine();
            System.out.print("You entered " + itemType + ". Please type 'yes' if this is correct: ");
            yes = input.nextLine();
            while(!yes.equalsIgnoreCase("yes"))
            {
                System.out.print("Please enter the name of the item: ");
                input.nextLine();
                itemType = input.nextLine();
                System.out.print("You entered $" + itemType + ". Please type 'yes' if this is correct: ");
                input.nextLine();
                yes = input.nextLine();
            }
            if(itemType.equalsIgnoreCase("brick"))
                total += price;
                System.out.println("You've sold another brick and added $" + price + " making your total $" + total);

        }
        input.close();
        System.out.println("Congratulations! You've sold over $1399.99 in bricks and received a free pack of gum! Enjoy! :D");

    }

}



