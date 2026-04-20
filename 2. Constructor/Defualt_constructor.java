
import java.lang.classfile.ClassFile;

// Default Constructor.
class A {

    int a;
    String b;
    boolean c;

    // A() {
    //     a = 100;
    //     b = "Utkarsh";
    //     c = true;
    // }

    void Disp() {
        System.out.println(a + " " + b + " " + c);
    }
}

public class Defualt_constructor {

    public static void main(String[] args) {

        A obj = new A();
        obj.Disp();
    }
}