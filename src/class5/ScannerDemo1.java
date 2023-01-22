package class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        Scanner => Name of the class
        scan is just a variable like we create primitive variables
        = => assignment operator
        System.in=> tells the computer we want to read the data from keyboard
         */

      /*
        System.out.println("Please enter your age");
        int age= scanner.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please enter your weight");
        double weight= scanner.nextDouble();
        System.out.println(" your weight is "+weight+" lbs");

        System.out.println("Are you hungry");
        boolean hungry= scanner.nextBoolean();
        System.out.println("Hungry "+hungry);*/


       /* System.out.println("Please enter your gender");
        char gender= scanner.next().charAt(0); //char is a type of input
        System.out.println("Your gender is "+gender);*/

        /*System.out.println("Please enter your name");
        String name= scanner.next(); //when we have to take only one word as input
        System.out.println("Your nane is "+name);*/
        scanner.nextLine(); // when we have nextLine method work after we have used any other method from //
        // Scanner class

        System.out.println("Please enter your full name ");
        String fullName= scanner.nextLine();
        System.out.println("Your full name is "+fullName);
        scanner.close(); // it is good practice to close




        }
    }

