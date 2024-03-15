

public class Merging {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    

    public static boolean get(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;


        
        while (temp1!=null) {
            while (temp2!=null) {
                if (temp1.data==temp2.data) {
                    return true;
                }
                temp2 = temp2.next;

            }
            temp2 = head2;
            temp1 = temp1.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(6);

        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = head1.next.next;

        System.out.println(get(head1, head2));

        // LinkedList head1 = new LinkedList<>();
        // head1.add(1);
        // head1.add(2);
        // head1.add(3);
        // head1.add(6);

        // LinkedList head2 = new LinkedList<>();
        // head2.add(4);
        // head2.add(5) ;
        // head2.add(6);
        

    }
}
