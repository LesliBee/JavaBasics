package class11;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                          {45, 55, 66},
                          {30, 40, 20, 10, 25}
        };
        System.out.println(matrix[2][4]);
        // to get all the info from 1st array:
        System.out.println(Arrays.toString(matrix[0]));
        // if we want to use a loop to print all the elements from the 1st group:
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[0][i]);
        }
        // you can also say:
        int[] arr=matrix[0]; //getting complete 1st array fom 2D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //to print elements of last array:
        int[] arr2=matrix[2]; //getting complete 1st array fom 2D array
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

    }
    }}

