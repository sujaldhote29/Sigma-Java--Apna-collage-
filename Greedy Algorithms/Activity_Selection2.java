import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection2 {
    public static void main(String[] args) {
        int start[] = { 1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};


        int actvities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            actvities[i][0] = i;
            actvities[i][1] = start[i];
            actvities[i][2] = end[i];
        }


        // lambda function -> shortform

        Arrays.sort(actvities,Comparator.comparingDouble(o -> o[2]));

         // end time basis sorted

         int maxAct = 0;
         ArrayList<Integer> ans = new ArrayList<>();
 
         // list activity
         maxAct = 1;
         ans.add(actvities[0][0]);
         int LastEnd = actvities[0][2];
         for(int i =1 ; i<end.length; i++){
             if(actvities[i][1]>= LastEnd){
                 maxAct++;
                 ans.add(actvities[i][0]);
                 LastEnd = actvities[i][2];
             
             }
         }
         System.out.println("Maximum Activities = "+maxAct);
 
         for(int i =0; i<ans.size(); i++){
             System.out.println("A"+ans.get(i));
         }
    }
}
