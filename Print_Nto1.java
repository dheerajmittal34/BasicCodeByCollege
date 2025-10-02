public class Print_Nto1 {

    // Recursive function to print numbers from 1 to n on the same line
    public static void printDrumbeats(int n) {
        if (n == 0) {
            return; 
        }

        System.out.print( n + " ");
        printDrumbeats(n - 1); // Recursive call to print smaller numbers first
    }

    public static void main(String[] args) {
        int n = 5; 
        
        printDrumbeats(n);
        
    }
}
