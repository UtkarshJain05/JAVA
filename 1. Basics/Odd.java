import java.util.*;

public class Odd {

    public static void main(String args[]) {
        int n;
        System.out.print("Enter No. of Terms : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
