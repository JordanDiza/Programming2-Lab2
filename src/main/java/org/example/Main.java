package org.example;

public class Main {
    static void main(String[] args) {

        int[] values = new int[]{1, 2, 3, 4, 15, -192, 200};
        int highest = findHighest(values);
        System.out.println("Highest value is :" + highest);


    }

    // Part A
    public static int findHighest(int[] values) {
        int highestValue = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] > highestValue) {
                highestValue = values[i];
            }
        }
        return highestValue;
    }
}
 // Part B
 /*
 1. Both would print 99
 2. Both reference point to the same array
 3. Theyre both the same
 5. int[] b = ArrayscopyOf(a,.alength);
*/



