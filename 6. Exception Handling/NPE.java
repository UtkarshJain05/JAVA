// NullPointerException.

public class NPE {
    public static void main(String[] args) {
        String str = null;
        try{
        System.out.println(str.toUpperCase());}
        catch(Exception e){
            System.out.println("Exception aa rha h.");      
        }
    }    
}
