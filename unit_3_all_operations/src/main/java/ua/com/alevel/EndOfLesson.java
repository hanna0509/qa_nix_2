package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EndOfLesson {

    public void endOfLesson() {

        Scanner s = new Scanner(System.in);
        System.out.print(" Do you want to know when lesson ends? Please enter the number of lesson: ");

        int n = s.nextInt();
        n = n * 45 + (n / 2) * 5 + ((n + 1) / 2 - 1) * 15;

        int hours = n / 60 + 9;
        int minutes = n % 60;
        System.out.print("Lesson end time: " + hours + ":" + minutes);
    }
}

