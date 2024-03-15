public class Maximum_balanced_String {
    public static int Balanced(String str){
        int n = str.length();
        int ans = 0;
        int leftcount = 0;
        int rightcount = 0;
        for(int i =0; i<n; i++){
            char c = str.charAt(i);
            if (c=='L') {
                leftcount++;
            }else{
                rightcount++;
            }

            if (leftcount==rightcount) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        System.out.println(Balanced(str));
    }
}
