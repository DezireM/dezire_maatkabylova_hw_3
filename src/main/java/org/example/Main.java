package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {8.4, 4.5, -7.3, -7.9, 1.2, -3.5, 4.6, -1.8, 0.9, -5.2, 2.7, -6.3, 0.25, 9.75, 5.45};
        double sum = 0;
        int count = 0;
        boolean foundNegative = false;

        for (double number : numbers) {
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            }
            if (number < 0) {
                foundNegative = true;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println(Arrays.toString(numbers) + " = " + sum + "/" + count);
            System.out.println("Среднее арифметическое: " + average);
        }
    }
}