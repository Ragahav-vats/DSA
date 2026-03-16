import java.util.*;

public class Subsequence {
    public static void subsequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        // To be 
         subsequences(str, idx+1, newString+currChar);

        // Not to be
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}