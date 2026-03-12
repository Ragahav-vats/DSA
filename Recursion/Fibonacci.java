import java.util.*;

public class Fibonacci {
    public static void Fib(int a, int b, int n) {
        // Base case
        if(n == 0) {
            return ;
        }
        int c = a + b;
        System.out.println(c);
        Fib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        Fib(a, b, n-2);
    }
}