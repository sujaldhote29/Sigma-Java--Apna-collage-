import java.util.Stack;

public class revStack {
    public static void rev(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    } 
    public static void main(String[] args) {
        String str = "sujal";
        rev(str);
    }
}
