// Multiple Try-Catch Block.

public class Multiple_try_catch {

    public static void main(String[] args) {
        try {
            int a = 10, b = 5, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException a) {
            System.out.println("Can't Divide by 0.");
        }
        try {
            int a[] = {10, 20, 30, 40, 50};
            System.out.print(a[5]);
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("Beyond the Array Limit.");
        }
    }
}
