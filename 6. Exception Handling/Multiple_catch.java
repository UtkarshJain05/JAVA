
public class Multiple_catch {

    public static void main(String[] args) {

        try {
            int a = 20, b = 2, c;
            c = a / b;
            System.out.println(c);

            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[3]);

            String str = null;
            System.out.println(str.toUpperCase());
        } catch (ArithmeticException a) {
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}