
import java.util.Scanner;

class A { //Super Class

    int a, b, c;
    Scanner sc = new Scanner(System.in);

    void add() {
        System.out.println("Enter a & b for Addition : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Sum of two Numbers : " + c + "\n");
    }

    void sub() {
        System.out.println("Enter a & b for Subtraction : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a - b;
        System.out.println("Difference of two Numbers : " + c + "\n");
    }
}

class B extends A {     //Sub1 Class

    void multi() {
        System.out.println("Enter a & b for Mutliplication : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a * b;
        System.out.println("Product of two Numbers : " + c + "\n");
    }

    void div() {
        System.out.println("Enter a & b for Division : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a / b;
        System.out.println("Division of two Numbers : " + c + "\n");
    }
}

class C extends B {   // Sub2 Class

    void rem() {
        System.out.println("Enter a & b for Remainder : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a % b;
        System.out.println("Remainder of two Numbers : " + c + "\n");
    }
}

public class Mutlilevel {

    public static void main(String[] args) {
        C ref = new C();
        ref.add();
        ref.sub();
        ref.multi();
        ref.div();
        ref.rem();
    }
}
