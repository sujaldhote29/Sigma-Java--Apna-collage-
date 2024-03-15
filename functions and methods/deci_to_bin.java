
public class deci_to_bin {
    public static void deci_bin(int deci_num) {

        int pow = 0;
        int binary = 0;
        while (deci_num > 0) {
            int rem = deci_num % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            deci_num = deci_num / 2;
            pow++;

        }
        System.out.println(binary);
    }

    public static void main(String[] args) {

        deci_bin(26);
    }
}
