
public class Str {

    public static void main(String[] args) {

        // //Way 1 : Using String Buffer.
        // StringBuffer r = new StringBuffer("Learn Coding");
        // System.err.println(r.reverse());

        // //Way 2 : Using String Builder.
        // StringBuilder ref = new StringBuilder("Java Coding");
        // System.err.println(ref.reverse());

        // Way 3 : Using Manual Way.
        int l;
        String r = "Learn Java.";
        String r2 = "";
        l = r.length();

        for(int i = l-1;i>=0;i--){
            r2 = r2+r.charAt(i);
        }
        System.out.println(r2);
    }
}
