package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Calculates and prints average of user enetered numbers
        int average = calculateAverage(scanner);
        System.out.println(average);

    }

    /*
    Calculates average of user enetered numbers
     */
    static int calculateAverage(Scanner scanner) {
        int sum = 0;
        int numberCount = 0;
        while(true) {
            int number = scanner.nextInt();
            if(number == 0) break;
            sum +=number;
            numberCount++;
        }
        return sum/numberCount;
    }
}