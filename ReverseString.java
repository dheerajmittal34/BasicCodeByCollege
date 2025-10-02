public class ReverseString {

    // Recursive function to reverse a string
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str; 
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Hello"; 
        System.out.println("Original: " + input);
        String reversed = reverseString(input);
        System.out.println("Reflection: " + reversed);
    }
}
