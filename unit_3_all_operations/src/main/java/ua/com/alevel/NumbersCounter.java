package ua.com.alevel;

import java.util.Scanner;

public class NumbersCounter {

    public void numbersCounter() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter string with any symbols including numbers:");
        String str = s.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Character.digit(str.charAt(i), 10);
            }
        }
        System.out.println("Sum of numbers= " + sum);
    }
}
