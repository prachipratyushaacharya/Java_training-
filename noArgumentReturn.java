public class noArgumentReturn {
    public static void main(String[] args) {
        int a = fun();
        System.out.println(fun());
    }

    public static int fun() {
        return 5;
    }
}
