// Parameterized Constructor.

class A {

    int x, y;

    A(int a, int b) {
        x = a;
        y = b;
    }

    A(int a, String b) {
        System.out.println(a + " " + b);
    }

    void Disp() {
        System.out.println(x + " " + y);
    }
}

public class parameterized {

    public static void main(String[] args) {
        A obj = new A(100, 200);
        A obj1 = new A(300, "Utkarsh");
        obj.Disp();
    }
}
