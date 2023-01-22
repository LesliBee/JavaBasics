package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        // a 2D Array that can hold 3-1D Array
        // each of a size 3
        String[][] thomasTrain=new String[3][3];
        String[] cabin0={"Adam","Zafar","Sam"};
        String[] cabin1={"Scottie","Scarlett","Paxton"};
        String[] cabin2={"Lesli","Theo","Selena"};

        thomasTrain[0]=cabin0;
        thomasTrain[1]=cabin1;
        thomasTrain[2]=cabin2;

        // in the 1st [] we specify the address of 1D Array
        System.out.println(thomasTrain[1][1]);
        System.out.println(Arrays.toString(thomasTrain[0]));
    }
}

