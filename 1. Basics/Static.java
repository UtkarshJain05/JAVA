
public class Static {

    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Static obj = new Static();
        Static.show();
        obj.Disp();
    }

    static void show() {
        System.out.println("Show() : " + b);
    }

    void Disp() {
        System.out.println("Disp() : " + a + " " + b);
    }

}
