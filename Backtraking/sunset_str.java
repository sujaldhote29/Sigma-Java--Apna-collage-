

public class sunset_str {
    public static void sub_str(String s , String ans , int i) {
        if (i==s.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        sub_str(s, ans+s.charAt(i), i+1);
        sub_str(s, ans, i+1);
    }
    public static void main(String[] args) {
        String s  = "abc";
        sub_str(s, "", 0);
    }
}
