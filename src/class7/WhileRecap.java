package class7;

public class WhileRecap {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        int number=10;
        while (number<20) {
            System.out.println(number < 20);
            if(number < 15){
            System.out.println("number is less than 15");
        }else{
                System.out.println("number is greater than 15");
            }
            System.out.println(number);
            number++; //increases the value of the number variable by one whenever executed
        }
    }
}
