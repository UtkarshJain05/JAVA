
interface client {

    void webdesign();

    void webdevelope();
}

abstract class Rajutech implements client {

    @Override
    public void webdesign() {
        System.out.println("Design Completed.");
    }
}

class Rahultech extends Rajutech {

    @Override
    public void webdevelope() {
        System.out.println("Developement Completed.");
    }
}

public class interface_method {
    public static void main(String[] args) {
        client ref = new Rahultech();
        ref.webdesign();
        ref.webdevelope();
    }
}
