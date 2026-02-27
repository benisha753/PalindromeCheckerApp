public class PalindromeCheckerApp {
    public static void main(string[] args){
        // Step 1: Declare and initialize the original string
        // Step 1: Declare the original string
        String original = "madam";

        // Step 2: Convert String to character array
        char[] characters = original.toCharArray();

        // Step 3: Apply two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Step 4: Display result
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}