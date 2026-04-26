
public class Nested_catch {

    public static void main(String[] args) {
        try {
            System.err.println(10 / 0);
        } catch (Exception a) {
            try {
                String str = null;
                System.err.println(str.toLowerCase());
            } catch (Exception b) {
                System.out.println("Null Value can't be converted.");
            }
        }
        System.err.println("Main Ended.");
    }
}
