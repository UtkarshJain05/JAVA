
public class Transpose {

    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30}, {40, 50, 60}};
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}