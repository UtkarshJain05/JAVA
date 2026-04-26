
public class Nested_Finally {

    public static void main(String[] args) {
        try {
            String a = "Ankit";
            System.out.println(a.toUpperCase());

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                System.out.println(10/0);
            } catch (Exception a) {
                System.err.println(a);
            } finally {
                System.err.println("Utkarsh Jain.");
            }
        }
        System.out.println("Main Method Ended.");
    }
}
