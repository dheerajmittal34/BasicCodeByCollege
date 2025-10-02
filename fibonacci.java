public class fibonacci {

    // Recursive function to find the nth Fibonacci number 
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println(result);
    }
}
