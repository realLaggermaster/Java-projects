// 3. January 2025

public class DataTypes {

    public static void main(String[] args) {

        // Integers
        byte numInByte = 127;
        short numInShort = 32767;
        int numInInt = 2147483647;
        long numInLong = 9223372036854775807L;
        // Compute the distance light travels using long.
        int lightSpeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 *60;
        long distance = lightSpeed + seconds;
        System.out.println("In " + days + " days, the light travels " + distance + " kilometers.");

        // Floating-point numbers
        float myBankAccount = 12.99f; // f forces it to be float
        double yourChanceToGetBitches = 0.00700001;
        System.out.println(myBankAccount);
        System.out.println(yourChanceToGetBitches);
        // Area of a circle
        double pi, r ,a;
        r = 8.7;
        pi = 3.1416;
        a = pi * r * r;
        System.out.println("Area of the circle is " + a);

        // Characters
        char letter = 937;
        System.out.println(letter);
        // Loop 1 - 50 unicodes
        char unicodeChar = 1;
        for (int i = 0; i < 50; i++) {
            unicodeChar++;
            System.out.println(unicodeChar);
        }

        // Booleans
        boolean whiteGood = true;
        boolean blackGood = false;
        System.out.println(whiteGood);
        System.out.println(blackGood);

    }

}