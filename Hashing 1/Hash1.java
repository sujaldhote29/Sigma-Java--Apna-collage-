
import java.util.*;
public class Hash1 {
    public static void main(String[] args) {
        // Create 
        HashMap<String,Integer> hm = new HashMap<>();


        // Insert -> O(1) 
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get -> O(1)
        //  int population = hm.get("India");
        //  System.out.println(population);


        //  System.out.println(hm.get("Indonesia"));


        //  // Contains key -> O(1)   return true/false


        //  System.out.println(hm.containsKey("India"));
        //  System.out.println(hm.containsKey("Indonesia"));

        // Remove 

        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // Size 
        System.out.println(hm.size());


        // isempty
        // hm.clear();
        System.out.println(hm.isEmpty());
    }
}
