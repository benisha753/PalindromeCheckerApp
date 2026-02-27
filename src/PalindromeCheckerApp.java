import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class PalindromeCheckerApp {
    public static void main(string[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input (optional)
        input = input.replaceAll("\\s+", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 1: Enqueue and Push characters
        for (char ch : input.toCharArray()) {
            queue.add(ch);      // Enqueue
            stack.push(ch);     // Push
        }

        boolean isPalindrome = true;

        // Step 2: Compare dequeue and pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();   // Dequeue (FIFO)
            char fromStack = stack.pop();      // Pop (LIFO)

            if (fromQueue != fromStack) {
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