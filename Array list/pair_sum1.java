import java.util.ArrayList;

public class pair_sum1 {
    // Brute force approach
    public static boolean sum1(ArrayList<Integer> list1, int target){
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i+1; j < list1.size(); j++) {
                if (list1.get(i)+list1.get(j)==target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sum2(ArrayList<Integer> list1,int target){
        int lp =0;
        int rp = list1.size()-1;
        while (lp!=rp) {
            if (list1.get(lp)+list1.get(rp)== target) {
                return true;
            }
            if (list1.get(lp)+list1.get(rp)<target) {
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(sum1(list1, 5));
        System.out.println(sum2(list1, 5));


    }
}
