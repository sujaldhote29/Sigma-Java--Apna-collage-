public class Univalued {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.right = this.left = null;
        }
    }

    public static boolean isUnivalued(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }

        boolean isleftunivalued = isUnivalued(root.left);
        boolean isrightunivalued = isUnivalued(root.left);

        // return isleftunivalued && isrightunivalued;

        if (isleftunivalued==false) {
            return false;
        }
        if (isrightunivalued==false) {
            return false;
        }

        return true;
    }

    public static void main(String args[]) {
        Node root = new Node(2);
        root.right = new Node(2);
        root.left = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(2);

        System.out.println(isUnivalued(root));
    }
}
