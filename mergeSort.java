import java.util.Scanner;

public class mergeSort {
    static int[] o; // no object is created, original array
    static int[] s; // sorterd array

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        o = new int [n];
        s = new int [n];

        public static void mergeSort(int l, int h){
            if (l<h){
                int mid = (l+h) / 2;
                mergeSort(l,m);
                mergeSort(m+1, h);
            }
        }

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Selection sort logic
        int min;

        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(a, i, min);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
