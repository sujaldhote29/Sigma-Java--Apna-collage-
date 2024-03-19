
public class tri {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    /*
     * 
     * Q Given an input string and a dictionary of words, find out if the input
     * string
     * can be broken into a space-separated sequence of dictionary words.
     */

    public static boolean wordbreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) &&
                    wordbreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    /*
     * 
     * 
     * Find shortest unique prefix for every word in a given list.
     * Assume no word is prefix of another.
     */

    public static void main(String[] args) {
        // String words[] = { "the", "a", "there", "their", "any", "thee" };

        // for (int i = 0; i < words.length; i++) {
        // insert(words[i]);
        // }

        // System.out.println(search("thee"));
        // System.out.println(search("thor"));

        /*
         * 
         * Q Given an input string and a dictionary of words, find out if the input
         * string
         * can be broken into a space-separated sequence of dictionary words.
         */
        // String arr[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

        // for (int i = 0; i < arr.length; i++) {
        // insert(arr[i]);
        // }

        // String key = "ilikesamsung";
        // System.out.println(wordbreak(key));

        /*
         * 
         * 
         * 
         * Find shortest unique prefix for every word in a given list.
         * Assume no word is prefix of another.
         */


         

    }
}
