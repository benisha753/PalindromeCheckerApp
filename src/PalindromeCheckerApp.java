import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(string[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input (optional)
        input = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Step 1: Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);   // Insert at rear
        }

        boolean isPalindrome = true;

        // Step 2: Compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}
