import java.util.*;

class L3q4 {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s = "This is decent";
        System.out.println(reverseWords(s)); 
    }
}
