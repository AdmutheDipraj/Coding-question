package com.demo;

public class StarPattern {
        public static void main(String[] args) {
            int rows = 5;

            // Loop through each row
            for (int i = 1; i <= rows; i++) {

                // Print spaces before the stars
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int k = i; k <= 2 * rows - i; k++) {
                    System.out.print("*");
                }

                // Move to the next line after each row
                System.out.println();
            }
        }


}
