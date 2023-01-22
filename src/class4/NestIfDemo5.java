package class4;

public class NestIfDemo5 { //NestIf is a condition inside a condition
    public static void main(String[] args) {

        int money=1000;
        String day="Sunday";
        boolean mood=true;

        if(money>700){

            if(mood){
                System.out.println("Let's go shopping");
            }
        }
    }
}
