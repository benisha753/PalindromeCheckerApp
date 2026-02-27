public class PalindromeCheckerApp {
    public static void main(string[] args){
        // Step 1: Declare and initialize the original string
        String original = "radar";

        // Step 2: Create an empty string to store reversed value
        String reversed = "";

        // Step 3: Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String concatenation
        }

        // Step 4: Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}
