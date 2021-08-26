package ua.com.alevel;

public class ReverseString {

    public static String reverse(String str) {
        char[] array = str.toCharArray();
        String newString = "";
        for (int i = array.length - 1; i >= 0; i--) {
            newString = newString + array[i];
        }
        return newString;
    }

    public static String reverseWords(String str, boolean reverseAll) {
        String[] words = str.split(" ");
        String reverseWords = "";
        for (int i = 0; i < words.length; i++) {
            reverseWords = reverseWords + " " + reverse(words[i]);
        }
        return reverseWords.trim();
    }

    public static String reverseSubstring(String str, String dest) {
        return str.replace(dest, reverseWords(dest, true));
    }

    public static String reverseByIndex(String str, int firstIndex, int lastIndex) {
        String toReverse = str.substring(firstIndex, lastIndex + 1);
        String reversed = reverseWords(toReverse, true);
        return str.replace(toReverse, reversed);
    }
}



