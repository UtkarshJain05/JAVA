
public class Nested_try {

    public static void main(String[] args) {
        try {
            try {
                int arr[] = {1, 2, 3, 4, 5};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println(a);
            }
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.err.println("Completed.");
    }
}
