
class A {

    void show() {
        System.out.println(this);
    }
}

public class this_keyword_1 {

    public static void main(String[] args) {
        A r = new A();
        System.out.println(r);
        r.show();
    }
}
