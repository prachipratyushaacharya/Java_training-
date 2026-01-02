
import java.util.Scanner;

public class lineraSearch {
    public static void main(String[] args) {
        // int [] a = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        // we can use flag, int flag = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                System.out.print("Yes");
                return;
            }
            System.out.println("No");
        }
    }
}