import java.util.Scanner;
import java.util.Random;
public class java1 {
    public static void main(String[] args) {
        array();
        array1();
    }

    public static void array() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n, m;
        System.out.print("MAs zhol engyz =");
        n = sc.nextInt();
        System.out.print("MAs bagan engyz =");
        m = sc.nextInt();
        int a[][] = new int[n][m];
        //mas toltyru
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = r.nextInt(20) - 10;
                System.out.print(a[i][j]+"\t") ;
            }
            System.out.println();
        }
    }

    public static void array1() {
        array();
        int[][] a;
        a = new int;
        if (a[i][j]% 2 == 0) {
            System.out.println();
        }
    }
}