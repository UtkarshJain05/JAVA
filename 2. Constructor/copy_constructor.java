// Copy Constructor.

class A {

    int a;
    String b;

    A() {
        a = 10;
        b = "Utkarsh.";
        System.out.println("Default Original : " + a + " " + b);
    }

    A(int x, String y) {
        a = x;
        b = y;
        System.out.println("Parameterized : " + x + " " + y);
    }

    A(A ref) {
        a = ref.a;
        b = ref.b;
        System.out.println("Copied : " + a + " " + b);
    }
}

public class copy_constructor {

    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A(10, "Utkarsh Jain");
        A obj2 = new A(obj);
        // A obj2 = new A(obj1);
    }
}
