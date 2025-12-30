import java.util.Scanner;

public class controlStructs {
    public static void main(String args[]) {
        // float a = 0.5f; // 0.1,0.35,0.125
        // // if condition
        // if (a == 0.5) {
        // System.out.print("same");
        // } else {
        // System.out.print("Not same");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int b = sc.nextInt();

        // //if-else, cascaded
        // if (b % 3 == 0 && b % 2 == 0) {
        // System.out.print("Divisible by 2 & 3");
        // } else if (b % 2 == 0) {
        // System.out.print("Divisible by 2");
        // } else if (b % 3 == 0) {
        // System.out.print("Divisible by 3");
        // } else {
        // System.out.print("Not Divisible by 2 & 3");
        // }

        // // nested if
        // if (b % 2 == 0) {
        // if (b % 3 == 0) {
        // System.out.print("Divisible by 2 & 3");
        // } else {
        // System.out.print("Divisible by 2");
        // }
        // } else {
        // if (b % 3 == 0) {
        // System.out.print("Divisible by 3");
        // } else {
        // System.out.print("Not Divisible by 2 & 3");
        // }
        // }

        // // switch case
        // int choice = sc.nextInt();
        // switch (choice) {
        // case 1:
        // case 3:
        // case 5:
        // case 7:
        // case 8:
        // case 10:
        // case 12:
        // System.out.println("31 DAYS");
        // break;
        // case 4:
        // case 6:
        // case 9:
        // case 11:
        // System.out.println("30 DAYS");
        // break;
        // default:
        // System.out.println("28/29 DAYS");
        // break;
        // }

        // // WHILE LOOP
        int i = 1;
        // while (i <= 3) {
        // System.out.println(i + " ");
        // i++;
        // }

        for (System.out.print(i + " "); i <= 3; i++) {
            System.out.println(i + " ");
        }

        for (i = 1; i <= 3; System.out.print(i + " ")) {
            System.out.println(i + " ");
            i++;
        }

        for (i = 1, System.out.print(i + " "); i <= 3; i++) {
            System.out.println(i + " ");
        }
    }
}
