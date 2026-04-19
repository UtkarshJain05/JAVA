import java.util.*;

public class Char {

    public static void main(String[] args) {
        char a;
        Scanner sc = new Scanner(System.in);
        a = sc.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.print(a+" is a vowel.");
        }
        else{
            System.out.print(a+" is a Consonant.");
        }
    }
}
