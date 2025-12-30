
import java.util.Scanner;

public class arrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // // Print odd numbers
        // for (int i = 1;i<n; i+=2){
        // System.out.println(a[i] + " ");
        // }

        // elment is the sum of perfect suqares

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int x = (int) Math.sqrt(a[i]);
            if (x * x == a[i]) {
                sum += a[i];
            }
        }

        System.out.println("sum=" + sum);

    }
}
