


public class Try_Catch_vs_Throws {

    public static void Wait() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            // try {
            //     System.out.println(i);
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            //     System.out.println(i);
            // }

            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Wait();
        System.err.println("Utkarsh jain");
    }
}
