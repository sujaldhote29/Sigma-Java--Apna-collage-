import java.util.*;

public class multiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);

        mainList.add(list3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> cur = mainList.get(i);
            for (int j = 0; j < cur.size(); j++) {
                System.out.print(cur.get(j)+" ");
            }
            System.out.println();
        }


        System.out.println(mainList);
    }
}
