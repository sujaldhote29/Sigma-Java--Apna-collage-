import java.util.LinkedList;

public class Keep_m_and_remove_n {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void nw(LinkedList<Node> list, int m, int n) {
        Node temp = list.getFirst();
        while (temp != null) {
            // Keep m elements
            for (int i = 0; i < m && temp != null; i++) {
                temp = temp.next;
            }
            // Remove n elements
            for (int i = 0; i < n && temp != null; i++) {
                Node next = temp.next;
                list.remove(temp);
                temp = next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Node> list = new LinkedList<>();
        // Create the linked list
        for (int i = 1; i <= 10; i++) {
            list.add(new Node(i));
        }

        int m = 2;
        int n = 1;
        
        // Call the method to keep 'm' elements and remove 'n' elements alternately
        nw(list, m, n);

        // Print the modified linked list
        for (Node node : list) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
}
