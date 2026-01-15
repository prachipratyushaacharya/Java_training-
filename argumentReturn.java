
public class argumentReturn {
    public static void main(String[] args) {
        int a = fun(5, 10);
        System.out.println(a);
    }

    public static int fun(int a, int b) {
        return a + b;
    }
}
