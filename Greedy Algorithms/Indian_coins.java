import java.util.*;

public class Indian_coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int Count0fCoins = 0;
        System.out.print("enter the amount = ");
        int amount = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =0; i<coins.length; i++){
           if (coins[i]<=amount) {
            while (coins[i]<=amount) {
                Count0fCoins++;
                ans.add(coins[i]);
                amount-=coins[i];
            }
           }
        }

        System.out.println("total minimum coins = "+Count0fCoins);

        for(int i =0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }

        sc.close();
    }
}
