public class PalindromeCheckerApp {
    public static void main(string[] args){
        System.out.println("Welcome to palindrome Checker App");
        String input = "madam";
        boolean isPalindrome= true;
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.chatAt(input.length()-1-i)){
                is palindrome=false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
    }
}
