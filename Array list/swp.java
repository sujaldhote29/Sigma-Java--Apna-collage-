import java.util.ArrayList;
public class swp {

    public static void sw(ArrayList<Integer> list1,int idx1 , int idx2){
        int temp = list1.get(idx1);
        list1.set(idx1, list1.get(idx2));
        list1.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);
        sw(list1, 1, 2);
        System.out.println(list1);

    }
}
