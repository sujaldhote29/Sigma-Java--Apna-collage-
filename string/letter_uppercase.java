/**
 * The "letter_uppercase" class capitalizes the first letter of each word in a given string.
 */
public class letter_uppercase {
    public static void main(String args[]){
        String str = "the car was obtained by whole class";
        StringBuilder s = new StringBuilder("");
        s.append(Character.toUpperCase(str.charAt(0))); // Capitalize first letter of the string

        for(int i = 1; i < str.length(); i++){
            if (str.charAt(i - 1) == ' ') { // Check if the previous character is a space
                char ch = Character.toUpperCase(str.charAt(i)); // Capitalize current character
                s.append(ch);
            } else {
                s.append(str.charAt(i)); // Otherwise, just append the character as it is
            }
        }

        System.out.println(s.toString()); // Print the modified string
    }
}
