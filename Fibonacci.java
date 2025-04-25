public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;

        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
