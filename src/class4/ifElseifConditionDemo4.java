package class4;

public class ifElseifConditionDemo4 {
    public static void main(String[] args) {
        int number1=10;
        int number2=10;
        /*
        if number 1 is equal to number2 on console => numbers are equal
        if number 1>number2 => Number1 is greater than number2
        if number2>number1 => Number2 is greater than number1
         */
        if(number1==number2){
            System.out.println("numbers are equal");
        }else if (number1>number2){
            System.out.println("Number1 is greater than Number2");
        }else if (number2>number1){
            System.out.println("Number2 is greater than Number1");

        }

    }
}
