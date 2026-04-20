// Private Constructor.

class A {

    int a, b;

    private A() {
        a = 10;
        b = 20;
        System.err.println(a + " " + b);
    }
    static void Disp(){
        System.err.println("Utkarsh Jain.");
    }
}

public class Private_Constructor {

    public static void main(String[] args) {
        // A obj = new A();5
        A.Disp();   
    }
}

// This will Give error becoz there's private Constructor.
