public class Factorial {

    // Recursive function to calculate factorial of n
    public static long unlockLock(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * unlockLock(n - 1); 
    }

    public static void main(String[] args) {
        int n = 5; 
        long factorial = unlockLock(n);
        System.out.println(factorial);
    }
}
