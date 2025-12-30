public class strings {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer();
        name.append("Ram");
        System.out.print(name.capacity());
        // once the 50% of the alllocated capacity(bits/bytes) are used, strings will
        // get relocated to some other part

    }
}
