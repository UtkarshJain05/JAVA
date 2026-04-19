// Recursive Factorial.

import java.util.*;

public class factorial {

    public static void main(String[] args) {
        int n, ans;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        factorial obj = new factorial();
        ans = obj.fact(n);
        System.err.println("Factorial of " + n + " = " + ans);
    }

    int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
