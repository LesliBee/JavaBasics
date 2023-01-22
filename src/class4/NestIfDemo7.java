package class4;

public class NestIfDemo7 { //NestIf is a condition inside a condition
    public static void main(String[] args) {

       boolean studyHard=true;
       int salary=90000;

       if(studyHard){

           System.out.println("We get the jobs");

           if(salary>100000) {
               System.out.println("Let's buy a Tesla");


           }else{
               System.out.println("Let's buy a Toyota");
           }

       }else {
           System.out.println("It might take a little longer for us to get the jobs");
        }
    }
}
