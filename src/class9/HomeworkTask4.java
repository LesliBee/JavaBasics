package class9;

import java.util.Scanner;

public class HomeworkTask4 {
    public static void main(String[] args) {
        /*
       1) Write a program to ask a user to enter item they want to buy and the price of that item. User will
       be entering 5 items. Every time user enters price accumulate the price and tell the user how much
        totalPrice that they should pay.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"
         */

        //Break down this problem into 4 to 5 steps that we can write the code for and can test those independently
        /*
        1) ask user to enter item and item price
        2) accumulate the price
        3) tell the user how much the total is
        4) if user gives more money, the program should return a change
        5) Thank you for shopping
         */

        Scanner scanner = new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please Enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the totalPrice amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>totalPrice){
            double chang=amountPaid-totalPrice; // calculating the change
            System.out.println("Hey here is your change "+chang);
        }
        System.out.println("Thank you for shopping!");

    }}
