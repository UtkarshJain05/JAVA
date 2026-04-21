
class A {

    A(int a) {
        System.out.println("Hello A class." + a);
    }
}

class B extends A {

    B() {
        super(100);
        System.out.println("Hello B Class.");
    }
}

public class Super_keyword {

    public static void main(String[] args) {
        B r = new B();
    }
}
