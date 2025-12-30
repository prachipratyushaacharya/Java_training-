import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0, count = 0;

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Prime");
        }

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Prime");
        }

        // logic 3
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Prime");
        }

        // logic 4 square root of n

        // if (i%6==1) || (i%6==5) then proceed with suare root logic
    }
}
