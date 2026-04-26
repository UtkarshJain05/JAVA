
public class Exception_propagation {

    public static void main(String[] args) {
        m1();
        System.out.println("Utkarsh Jain.");
    }

    public static void m1() {
        try {
            m2();
        } catch (Exception e) {
            System.out.println("Exception Handled.");
        }

    }

    public static void m2() {
        System.out.println(10 / 0);
    }
}
