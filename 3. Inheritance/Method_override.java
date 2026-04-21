// Method Overriding

class shape {

    void draw() {
        System.out.println("Can't Say shape Type");
    }
}

class square extends shape {

    @Override
    void draw() {  
        super.draw(); 
        System.out.println("square shape");
    }
}

public class Method_override {

    public static void main(String[] args) {
        square r = new square();
        r.draw();
    }
}
