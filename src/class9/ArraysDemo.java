package class9;

public class ArraysDemo {
    public static void main(String[] args) {

        String mame="Slava";
        String name2="Safi";
        String mame3="Jason";
        String name4="Nabi";
        String name5="Anees";

        String [] names={"Slava", "Safi", "Jason", "Anees", "Joseph"};

        System.out.println(name2);
        System.out.println(names[4]); // starts from 0, so Safi is not 2, it's 1
        System.out.println(names[3]);
        System.out.println(names[5]);
        // System.out.println(names[500]); error because there is no name on index number 500
        // System.out.println(names[-5]);error because index can't be negative
        // Write a loop to print all the names from the array



    }
}
