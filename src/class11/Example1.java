package class11;

public class Example1 {
    public static void main(String[] args) {

        int [][] matrix= {{10, 20, 30},
                          {45, 55, 66},
                          {30, 40, 20, 10, 25}
        };
        //write a loop to print all odd numbers from this 2D array

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]%2!=0){
                    System.out.println(matrix[i][j]);
                }
            }
            //foreach loop to print all the numbers from a 2D array
            for(int[] arr:matrix ){

                for(int number:arr){
                    System.out.print(number+" ");

            }

    }

}}}