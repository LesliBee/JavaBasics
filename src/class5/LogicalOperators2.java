package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

          /*
        if the score of all the subjects are greater than 90, print brilliant student. Otherwise, print you need to
        work hard
         */

        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;

        if (mathScore>90){
            if (historyScore>90){
                if (scienceScore>90) {
                    System.out.println("You are a brilliant student");
                }else{
                    System.out.println("You need to work harder");
                }
            }
        }


        if (mathScore>90&&historyScore>90&&scienceScore>90) {
            System.out.println("You are a brilliant student");
        }else{
            System.out.println("You need to work harder");
        }






        }
    }

