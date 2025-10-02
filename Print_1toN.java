public class Print_1toN {

    // Recursive function to print numbers from 1 to n on the same line
    public static void printDrumbeats(int n) {
        if (n == 0) {
            return; 
        }

        printDrumbeats(n - 1); // Recursive call to print smaller numbers first
        System.out.print( n + " "); 
    }

    public static void main(String[] args) {
        int n = 5; 
        
        printDrumbeats(n);
        
    }
}
