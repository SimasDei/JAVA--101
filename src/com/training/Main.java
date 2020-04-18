package com.training;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /*
            Primitive Types:
            Type    Byte    Range

            byte    1   [-128, 127]
            short   2   [-32k, 32k]
            int     4   [-2B, 2B]
            long    8
            float   4
            double  8

            char    2   A,B,C
            boolean 1   true/false

         */

        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;

        char letter = 'A';

        boolean isEligible = true;

        /*
            Reference Types
            Type    Byte    Range

            Date    ?

         */

        Date now = new Date();

        System.out.println("Ahoy sailor o/ ⛵️, " + now);
    }
}
