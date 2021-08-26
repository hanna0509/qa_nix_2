package ua.com.alevel;

import java.io.IOException;
import java.util.Scanner;

public class ReverseStringMain {

    public static void main(String[] args) {

        while (true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Select 1 to reverse whole string");
            System.out.println("Select 2 to reverse each word in your string");
            System.out.println("Select 3 to reverse substring");
            System.out.println("Select 4 to reverse part of sting by the indexes of characters");
            System.out.println("Select 5 to exit");

            int number = 0;
            while (number < 6) {
                try {
                    number = sc1.nextInt();

                    if (number < 1 || number > 5) {
                        System.out.println("Sorry, you entered wrong number. Please select the number from 1 to 5");
                        continue;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Sorry. You selected wrong symbol. Please start again");
                }
                break;
            }

            switch (number) {
                case 1: {
                    Scanner s = new Scanner(System.in);
                    System.out.println("Please enter your string: ");
                    String str = s.nextLine();
                    System.out.println("Your reversed string: " + ReverseString.reverse(str));
                }
                break;
                case 2: {
                    Scanner s = new Scanner(System.in);
                    System.out.println("Please enter your string: ");
                    String str = s.nextLine();
                    System.out.println("Your reversed words in the string: " + ReverseString.reverseWords(str, true));
                }
                break;
                case 3: {
                    Scanner s = new Scanner(System.in);
                    System.out.println("Please enter your string: ");
                    String str = s.nextLine();
                    Scanner s1 = new Scanner(System.in);
                    System.out.println("Please enter substring: ");
                    String dest = s1.nextLine();
                    System.out.println("Your reversed substring is: " + ReverseString.reverseSubstring(str, dest));
                }
                break;
                case 4: {
                    Scanner s = new Scanner(System.in);
                    System.out.println("Please enter your string: ");
                    String str = s.nextLine();
                    Scanner s1 = new Scanner(System.in);
                    System.out.println("Please enter first index where reverse should be start: ");
                    int firstIndex = s1.nextInt();
                    Scanner s2 = new Scanner(System.in);
                    System.out.println("Please enter last index where reverse should be end: ");
                    int lastIndex = s2.nextInt();
                    if (firstIndex < 0 || lastIndex < firstIndex || lastIndex > str.length()) {
                        System.out.println("You entered wrong indexes. Please try again");
                        break;
                    }
                    System.out.println("Your new string is: " + ReverseString.reverseByIndex(str, firstIndex, lastIndex));
                }
                break;
                case 5: {
                    System.out.println("Good bye!");
                    System.exit(0);
                }
            }
        }
    }
}

