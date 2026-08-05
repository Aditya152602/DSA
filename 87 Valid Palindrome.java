import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        // Remove all non-alphanumeric characters (spaces, punctuation)
        String cleanedWord = a.replaceAll("[^a-zA-Z0-9]", "");
        
        // Reverse the cleaned word
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
        
        // Compare them
        if (cleanedWord.equalsIgnoreCase(reversedWord)) {
            System.out.println("YES, \"" + a + "\" is a palindrome!");
        } else {
            System.out.println("NO, \"" + a + "\" is not a palindrome!");
        }
        
        sc.close();
    }
}
