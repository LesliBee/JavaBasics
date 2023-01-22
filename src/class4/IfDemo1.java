package class4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money=15000;

        if(money>1000){
            System.out.println("Let's buy an iPhone");
        }

        if(money>2000){
            System.out.println("Let's also buy a Macbook");
        }

        boolean mothersDay=true;

        if(mothersDay){
            System.out.println("Happy Mother's Day");
        }

        String name="Theo";

        // equals method is only used for non-primitives
        if(name=="Theo"){
            System.out.println("I love basketball");
        }
    }
}
