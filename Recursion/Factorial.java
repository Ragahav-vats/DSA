import java.util.*;

public class Factorial {
    public static int calcfactorial(int n) {
        // Base case
        if(n == 1 || n == 0) {
            return 1;
        }
        int fact_1 = calcfactorial(n-1);
        int mul = n * fact_1;
        return mul;
    }
    public static void main(String[] args) {
       int n = 5;
        int sum = calcfactorial(n);
        System.out.println(sum);
    }
}