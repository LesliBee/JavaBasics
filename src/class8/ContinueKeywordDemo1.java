package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i%3==0) { // "if i is a multiple of 3"
                continue; // skip
            }else{
                System.out.println(i);
            }
            System.out.println("Hello Java");

        }
        System.out.println("***************"); //another option

        for (int i = 0; i < 10; i++) {

            if (i%3==0) { // "if i is a multiple of 3"
                continue; // skip
            }
                System.out.println(i);
    }
}}
