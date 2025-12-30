
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // int [] a = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        int[] a = new int[0];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
