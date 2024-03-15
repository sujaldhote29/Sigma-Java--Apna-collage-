public class Mirror_tree {
    static class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void print(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }

    public static Node Mirror(Node root) {
        if (root == null) {
            return null;
        }

        Node newnode = new Node(root.data);

        Node left_mirror = Mirror(root.left);
        Node right_mirror = Mirror(root.right);

        newnode.left = right_mirror;
        newnode.right = left_mirror;

        return newnode;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        print(root);
        System.out.println();
        root = Mirror(root);
        print(root);

    }
}
