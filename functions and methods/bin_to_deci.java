
public class bin_to_deci {
    public static void bin_decimal(int bin_num){
        
        int pow = 0;
        int decimal = 0;
        while (bin_num>0) {
            int ld = bin_num%10;
             decimal = decimal+(ld*(int)Math.pow(2,pow));
             bin_num = bin_num/10;
             pow++;
             
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        
        bin_decimal(1001);
    }
}
