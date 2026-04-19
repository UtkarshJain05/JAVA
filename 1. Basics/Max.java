import java.util.*;

public class Max {

    public static void main(String[] args) {
        int a, b;
        System.err.println("Enter Both Nos. : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.print(a);
        } else {
            System.out.print(b);
        }
    }
}
