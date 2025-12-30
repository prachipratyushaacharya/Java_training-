import java.util.Scanner;

public class patternProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for (int j = 1; j <= 3; j++) {
        // for (int i = 0; i <= 3; i++) {
        // System.out.print("* ");
        // }
        // System.out.println(" ");
        // }
        int n = sc.nextInt();
        // for (int j = 0; j < n; j++) {
        // for (int i = 0; i <= j; i++) {
        // System.out.print("* ");
        // }
        // System.out.println(" ");
        // }

        // //diamond pattern
        // for (int i = 1; i <= n; i++) {
        // for (int k = 1; k <= n - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for (int i = n - 1; i >= 1; i--) {
        // for (int k = 1; k <= n - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // boundary square pattern
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == 1 || i == n || j == 1 || j == n) {
        // System.out.print("# ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // print the pattern
        // 1 5
        // 2 4
        // 3
        // for (int i = 1; i <= (n + 1) / 2; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == j || (n - i) + 1 == j) {
        // System.out.print(j);
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // X- pattern on number
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == j || (n - i) + 1 == j) {
        // System.out.print(j);
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= (10 ^ i) - 1; i++) {
            System.out.println(9);
        }

    }
}
