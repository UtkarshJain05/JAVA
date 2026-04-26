
public class Throws_vs_Throw {

    void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
        int c = a / b;
        System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Throws_vs_Throw t = new Throws_vs_Throw();
        t.div(10, 0);

        System.out.println("Main Ended");

    }
}
