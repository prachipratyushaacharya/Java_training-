import java.util.Scanner;

public class diagonalAddition {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = new int[n][n];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1 += a[i][j];
                }
            }
        }

        int temp = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == temp) {
                    d2 += a[i][j];
                    temp--;
                    break;
                }
            }
        }

        System.out.println(d1 + " " + d2);

    }
}
