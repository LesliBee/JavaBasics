package class5;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);

        int number=9;
        if(number==1) {
            System.out.println("Hello java");
        }else{
            System.out.println("Hello world");
        }

        String country="China";

        if (!country.equals(("Bad country"))){
            System.out.println("You're welcome");
        }
        if (country.equals("China")){
            System.out.println();
        }
    }
}
