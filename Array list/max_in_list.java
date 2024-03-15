import java.util.ArrayList;
public class max_in_list {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(4);
        list1.add(2);
        list1.add(7);
        list1.add(1);

        int larg = Integer.MIN_VALUE;

        for(int i = 0; i<list1.size(); i++){
            if (list1.get(i)>larg) {
                larg = list1.get(i);
            }
        }


        System.out.println(larg);


    }
}
