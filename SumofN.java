public class SumofN {

    // Recursive function to calculate sum of first n natural numbers
    public static int collectTreasure(int n) {
        if (n == 0) {
            return 0;
        }
        return n + collectTreasure(n - 1); 
    }

    public static void main(String[] args) {
        int n = 5; 
        int totalTreasure = collectTreasure(n);
        System.out.println(totalTreasure);
    }
}
