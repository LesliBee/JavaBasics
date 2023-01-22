package class2;

public class Variables {
    public static void main(String[] args) {
    /*
    Below line is reserving a box in the computer's memory.
    We are calling it box1 and if we need the information we are storing inside this box
    we can simply say to the computer, give us the content of box1.
    int=> what type of data we want to store
    box1=> is the name of the box
    = sign will take whatever we write after it and will store is inside the box1
    10=> is what we are storing inside the box
     */
    int box1=10;
    // if we are printing something from the boz we don't need ""
        System.out.println(box1); //we are saying here, bring the contents of box1 and print them on the console
        /*To store whole numbers (numbers without decimal points) we have 4 different types of boxes.
        For example, numbers like 10 20 3000 10000 33000
        1) byte 2) short 3) int 4) long
         */
        byte box2=-128; // range for byte is from -128 to 127 if we need to store larger numbers we should try short
        byte box3=-128;
        short box4=32767;
        int biggerBox=123456484; //most common type of box
        long maxBox=151438654639l;
        /*
        Reserve a box which can hold the number 1000 call it myBox and print its value on the console
         */
        short myBox=1000;
        System.out.println(myBox);
    }

}
