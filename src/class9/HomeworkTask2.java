package class9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        /*
        Homework 2: Create a program that will ask user to apply for a credit card 10 times. As soon as you get a "yes"
        from a user, program should stop asking
         */
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want a credit card?");
            String userResponse= scanner.next();
            if (userResponse.equalsIgnoreCase("Yes")){
                break;
            }


        }

    }}