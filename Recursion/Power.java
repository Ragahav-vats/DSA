import java.util.*;

public class Power {
    public static int calcPower(int x, int n) {
        // Base case 1
        if(n == 0) {
            return 1;
        }
        // Base case 2
         if(n == 0) {
            return 0;
        }

        int Xpower = calcPower(x , n-1);
        int mul = x * Xpower;
        return mul;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}