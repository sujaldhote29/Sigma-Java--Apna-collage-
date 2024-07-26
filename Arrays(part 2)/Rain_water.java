
public class Rain_water {

    public static int trappped_rain_water(int Height[]) {
        int n = Height.length;
        int left_max[] = new int[n];
        left_max[0] = Height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(Height[i], left_max[i - 1]);

        }

        int Right_max[] = new int[n];
        Right_max[n - 1] = Height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Right_max[i] = Math.max(Height[i], Right_max[i + 1]);
        }

        int trapped_water = 0;

        for (int i = 0; i < n; i++) {
            int water_level = Math.min(Right_max[i], left_max[i]);
            trapped_water += water_level - Height[i];
        }

        return trapped_water;
    }

    public static void main(String args[]) {
        // int Height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int Height[] = {2,3,5,6,7};

        int trap_water = trappped_rain_water(Height);

        System.out.println("The trapped rain water was : " + trap_water);
    }
}
