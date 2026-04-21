
class A{
    int a;
    A(int a){
        this.a = a;
    }
    void show(){
        System.out.println(a);
    }
}
public class this_keyword_2 {
    public static void main(String args[]) {
        A r = new A(100);
        r.show();
    }
}
