public class dispalcement {
    public static float shortest_path(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'W') {
                x--;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else {
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {
        // String str = "WNEENESENNN";
        String str = "NS";

        System.out.println("The shortest distance is : " + shortest_path(str));
    }
}
