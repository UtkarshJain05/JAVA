
class A {

    void input() {
        System.out.println("Enter Your Name : ");
    }
}

class B extends A {

    void show() {
        System.out.println("My Name is Utkarsh.");
    }
}

class C extends A {

    void Disp() {
        System.out.println("I told you My name is Utkarsh Jain");
    }
}

public class Hierarchical {

    public static void main(String[] args) {

        B r = new B();
        C r2 = new C();

        r.input();
        r.show();
        r2.input();
        r2.Disp();
    }
}
