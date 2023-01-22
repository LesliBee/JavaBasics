package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        //make sure you watch the video about TypeCasting in Course Announcement - type casting is not used too much
        long number=125;
        byte shorterNumber=(byte) number;
        float f=10.5f;
        int num=(int) f;
        System.out.println(shorterNumber);
        System.out.println(num);

        /*
        byte
        short
        int
        long
        float
        double
        If we try to store the contents from a similar box to a larger box, java doesn't complain because the content
        can easily fit inside the larger box, but if we try the other way around, we get an error and we need to type
        cast in to store the contents
         */
        byte b=10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholePart=(int)eggs;
        System.out.println(wholePart);





    }
}
