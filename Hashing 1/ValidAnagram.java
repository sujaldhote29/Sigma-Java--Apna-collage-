import java.util.*;

public class ValidAnagram {
    public static boolean anagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        }

        for(int i = 0; i<t.length(); i++){
            char c = t.charAt(i); 
            if (map.get(c)!=null) {
                if (map.get(c)==1) {
                    map.remove(t.charAt(i));
                }else{
                    map.put(c, map.get(c)-1);
                }
            }else{
                return false;
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        System.out.println(anagram(s, t));
    }
}
