import java.util.ArrayDeque;
// import java.util.LinkedList;
import java.util.Queue;
public class QueueFramework {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        // Queue q = new Queue(3);
        // Queue<Integer> q = new LinkedList<>(); // Array Deque
        @SuppressWarnings("unchecked")
        Queue<Integer> q = new ArrayDeque(); // Array Deque
        q.add(1);
        q.add(2);
        q.add(3);
        
        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
