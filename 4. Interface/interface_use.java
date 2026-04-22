
import java.util.Scanner;

interface client {

    void input();    // by defualt public and abstract

    void output();   // by defualt public and abstract
}

class Raju implements client {

    String name;
    double sal;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username : ");
        name = sc.nextLine();

        System.out.println("Enter Salary : ");
        sal = sc.nextDouble();
    }

    @Override
    public void output() {
        System.out.println(name + " " + sal);
    }
}

public class interface_use {

    public static void main(String[] args) {
        client ref = new Raju();
        ref.input();
        ref.output();
    }
}
