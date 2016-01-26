package p1;

/*
 * Program to simulate ordering sandwiches at Jimmy John's
 * Demo program for CIS 150
 * Mayra Mendez
 * 21Jan16
 * Version 1.0
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char option;
        double price, totalq, total= 0;
        int qty;

        System.out.println("Welcome to Jimmy John's\nWhat would you like?");

        do {
            //Prompt the user for a choice
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.print("Enter your choice: ");

            //Get the user choice and convert to upper case
            String choice = input.next();
            choice = choice.toUpperCase();

            //Store the first letter in a char
            option = choice.charAt(0);

            //Switch based on the option
            switch (option){
                //Ham
                case 'H':
                    price = 6.50;
                    break;
                //Roast Beef
                case 'R':
                    price = 6.75;
                    break;
                //Salami
                case 'S':
                    price = 6.25;
                    break;
                //Tuna
                case 'T':
                    price = 5.50;
                    break;
                //Done
                case 'D':
                    price = 0;
                    break;
                default:
                    System.out.println("Option " + choice + " is not available");
                    price = 0;
            }

            if(price != 0) {
                System.out.println("You chose: " + choice);
                System.out.printf("Cost: $%.2f\n", price);

                //Get the user quantity
                System.out.print("Enter the quantity: ");
                qty = input.nextInt();

                //total of the choice and the quantity
                totalq = (qty * price);
                System.out.println("Your total is $" + totalq);
                total += totalq;
            }

        } while(option != 'D');

        //Sum all together
        System.out.println("Your total is $" + total);
        System.out.println("Thank you for choosing Jimmy John's");
    }
}
