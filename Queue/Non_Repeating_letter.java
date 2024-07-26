/**
 * The `Non_Repeating_letter` class in Java implements a method to print the first non-repeating
 * character in a string while maintaining the order of characters using a queue and a frequency array.
 */
import java.util.LinkedList;
import java.util.Queue;

public class Non_Repeating_letter {
    public static void printNonRepeating(String str){
        int freq[] = new int[26]; // Frequency array for 26 letters of the alphabet
        Queue<Character> q = new LinkedList<>(); // Queue to maintain order of characters
        
        // Iterate through the string
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch); // Add current character to the queue
            freq[ch - 'a']++; // Increment frequency of current character
            
            // Check if the front of the queue has frequency greater than 1,
            // if so, remove characters from the queue until we find a non-repeating character.
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            
            // After adjusting the queue, print the first non-repeating character.
            if (q.isEmpty()) {
                System.out.print(-1 + " "); // If queue is empty, no non-repeating character found yet
            } else {
                System.out.print(q.peek() + " "); // Print the first non-repeating character
            }
        }
        System.out.println(); // Print a new line after processing all characters
    }
    
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
