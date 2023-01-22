package class8;

public class RecapDemo1 {
    public static void main(String[] args) {
        // 10 8 6 4 2 --> using while loop
        int number=10;
        while (number>=2){
            System.out.println(number);
            number-=2; // same as number=number-2
        }
        System.out.println("***************");
        // 10 8 6 4 2 --> using do while loop
        int number2=10;
        do {
            System.out.println(number2);
            number2=number2-2; // same as number2-=2
        }while (number2>=2);

    }
}
