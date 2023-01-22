package class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {
        // Create a program without break keyword before 11:16

        int temp=75;

        while (temp<=105){

            if (temp<=100) {
                System.out.println("I love summer because temperature is "+temp);
            }else{
                System.out.println("It's very hot "+temp);
            }
            temp+=5;
        }
    }
}
