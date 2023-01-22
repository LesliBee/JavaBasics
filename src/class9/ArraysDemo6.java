package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

        //create an empty array then store 45 44 33 20 10 in it.
        //Then use a loop to add all the elements which are present in even indexes and print it after adding them

        int [] numbers= new int[5]; //this is an empty array of 5
        numbers[0]=45;// 45+0
        numbers[1]=44;
        numbers[2]=33;// 45+33=>78
        numbers[3]=20;
        numbers[4]=10;// 78+10=>88
        //numbers [5]=50; error out of bounds

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            if (i%2==0){ // %2 is even
            sum=sum+numbers[i];
        }
    }
        System.out.println(sum);
}}