

public class duplicate_string {
    public static void remove_duplicate(String str ,int idx , StringBuilder newstr , boolean map[]){
        if (idx == str.length()) {
            System.out.print(newstr);
            return ;
        }
        char currchar = str.charAt(idx);
        if (map[currchar-'a']==true) {
            remove_duplicate(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a'] =true;
            remove_duplicate(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        remove_duplicate(str,0, new StringBuilder("") ,  new boolean[26]);
    }
}
