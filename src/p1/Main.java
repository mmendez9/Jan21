package p1;

/*
 * Program to simulate ordering sandwiches at Jimmy John's
 * Demo program for CIS 150
 * Mayra Mendez
 * 21Jan16
 * Version 0.1
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char option;

        System.out.println("Welcome to Jimmy John's\nWhat would you like?");

        do {
            //Prompt the user for a choice
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");

            //Get the user choice
            String choice = input.next();
            //Store the first letter in a char
            option = choice.charAt(0);
            
        } while(option != 'D');
        System.out.println("Thank you for choosing Jimmy John's");
    }
}
