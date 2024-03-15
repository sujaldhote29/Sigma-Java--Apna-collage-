import java.util.HashMap;

public class largest {
    public static boolean c(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
                map.put(charS, charT);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "food";
        String t = "good";
        System.out.println(c(s, t));
    }
}
