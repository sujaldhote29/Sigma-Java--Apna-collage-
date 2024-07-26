/**
 * The `priority` class in Java calculates the maximum profit that can be obtained by merging elements
 * from an array using a priority queue.
 */
import java.util.PriorityQueue;

public class priority {
    public static int pro(int[] arr) {
        int profit = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }

        while (pq.size() >= 2) {
            int p1 = pq.poll();
            int p2 = pq.poll();
            int p = p1 + p2;

            profit += p;
            pq.add(p);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 ,4};

        System.out.println(pro(arr));

    }
}
