// Constructor Overloading.

class A {

    int a;
    double b;
    String c;

    A() {
        a = 20;
        b = 4.5;
        c = "Utkarsh";
    }

    A(int x) {
        a = x;
    }

    A(double y, String z) {
        b = y;
        c = z;
    }
}

public class Constructor_overload {

    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A(10);
        A obj2 = new A(35.6, "JainSB");
        System.out.println(obj.a + " " + obj.b + " " + obj.c);
        System.out.println(obj1.a);
        System.out.println(obj2.b + " " + obj2.c);
    }
}
