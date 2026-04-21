
class Student {

    protected int roll, marks;
    String name;

    void input() {
        System.out.println("Enter roll, name and marks : ");
    }
}

class ankit extends Student {

    void disp() {
        roll = 1;
        marks = 89;
        name = "Ankit";
        System.out.println(roll + " " + name + " " + marks);
    }
}

public class Simple {

    public static void main(String[] args) {
        ankit r = new ankit();
        r.input();
        r.disp();
    }
}
