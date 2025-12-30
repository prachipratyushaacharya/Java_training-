
import java.util.Scanner;

public class addMatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int [][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Enter no. of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter no. of colums: ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] d = new int[r][c];

        System.out.println("Enter input for matrix one: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter input for matrix two: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                d[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}