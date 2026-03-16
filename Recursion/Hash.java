import java.util.HashSet;

public class Hash {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
        // To be 
         subsequences(str, idx+1, newString+currChar, set);

        // Not to be
        subsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}