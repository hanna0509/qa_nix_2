package ua.com.alevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SymbolsCounter {

    public void symbolsCounter() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter string with any symbols to count characters in it:");
        String str = s.nextLine();

        Map<Character, Integer> symbols = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (!symbols.containsKey(str.charAt(i))) {
                    symbols.put(str.charAt(i), 1);
                } else {
                    int value = symbols.get(str.charAt(i));
                    symbols.put(str.charAt(i), value + 1);
                }
            }
        }
        for (Map.Entry characters : symbols.entrySet()) {
            System.out.println("In your string: " + characters.getKey() + " -- " + characters.getValue());
        }
    }
}

