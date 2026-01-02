import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {
        // int [] a = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        int key = sc.nextInt();
        int l = 0, h = n - 1, m;

        while (l <= h) {
            m = (l + h) / 2;

            if (a[m] == key) {
                System.out.println("yes");
                return;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        System.out.println("No");
    }
}
