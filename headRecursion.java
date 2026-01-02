public class headRecursion {
    public static void main(String[] args) {
        // System.out.println(fact(5));
        fun(3);
    }

    public static void fun(int n) {
        if (n == 1) {
            System.out.println(n + "");
        } else {
            fun(n - 1);
            System.out.println(n + " ");
        }
    }
}
