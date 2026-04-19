// Instance Block

class A {

    int a, b;

    // Static Method
    static void Disp() {
        System.out.println("Static Disp Method.");
    }

    // Method
    void show() {
        System.out.println("Show Method.");
    }

    // Constructor
    A() {
        a = 30;
        b = 40;
        System.err.println("Constructor : " + a + " " + b);
    }

    // Instance
    {
        a = 10;
        b = 20;
        System.err.println("Instance : " + a + " " + b);
    }

    static {
    
        System.out.println("Static Block");
    }
}


public class Instance_block {

    public static void main(String[] args) {
        A.Disp();
        A obj = new A();
        obj.Disp();
        obj.show();
    }
}


// Static methods are flexible.