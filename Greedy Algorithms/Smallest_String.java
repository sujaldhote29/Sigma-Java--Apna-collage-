public class Smallest_String {
    public static String string(int n, int k) {
        int totalchar = n;
        int cursum = k;
        StringBuilder sb = new StringBuilder();
        while (totalchar > 0) {
            if ((totalchar - 1) * 26 >= cursum) {
                sb.append('a');
                cursum--;
            } else {
                int position = cursum % 26;
                if (position == 0) {
                    sb.append('z');
                    cursum -= 26;
                } else {
                    sb.append((char) (position - 1 + 'a'));
                    cursum -= position;
                }
            }
            totalchar--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 42;
        System.out.println(string(n, k));
    }
}
