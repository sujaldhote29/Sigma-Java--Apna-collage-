
import java.util.*;
public class Binary_Search_Tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left=this.right=null;

        }
    }

    public static Node insert (Node root, int val){
        if (root==null) {
            root = new Node(val);
            return root;
        }
        if (root.data>val) {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if (root==null) {
            return false;
        }

        if (root.data==key) {
            return true;
        }

        if (root.data>key) {
           return  search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root , int val ){
        if (root.data<val) {
            root.right = delete(root.right, val);
        }else if (root.data> val) {
            root.left = delete(root.left, val);
        }
        else{
            if (root.left==null && root.right == null) {
                return null;
            }

            if (root.left==null) {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }

            Node Is = FindInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);

        }
        return root;
    }

    public static Node FindInorderSuccessor(Node root){
        while (root.left!=null) {
            root = root.left;
        }
        return root;
    }

    public static void printinRange(Node root , int k1 , int k2){
        if (root==null) {
            return ;
        }
        if (root.data>=k1 && root.data<=k2) {
            printinRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printinRange(root.right, k1, k2);
        }else if (root.data<k1) {
            printinRange(root.right, k1, k2);
        }
    }

    public static boolean isValidBST(Node root, Node min , Node max){
        if (root==null) {
            return true;
        }

        if (min!=null && root.data <= min.data) {
            return false;
        }
        else if (max!=null && root.data>=max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }


    public static Node createMirror(Node root){
        if (root==null) {
            return null;
        }

        Node leftmirror = createMirror(root.left);
        Node rightmirror = createMirror(root.right);

        root.left = rightmirror;
        root.right = leftmirror;
        return root;
    }

    public static void preorder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBST(int arr[] , int st , int end){
        if (st>end) {
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left =createBST(arr, st, mid-1);
        root.right =createBST(arr, mid+1, end);

        return root;
    }

    public static Node createBST(ArrayList<Integer> inorder, int st , int end){
        if (st>end) {
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left =createBST(inorder, st, mid-1);
        root.right =createBST(inorder, mid+1, end);

        return root;
    }
    public static void getInorder(Node root , ArrayList<Integer> inorder){
        if (root==null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node balancedBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        // int values[] = {5,1,3,4,2,7};
        // int values[] = { 8,5,3,1,4,6,10,11,14};
        // int values[] = {1,1,1};
        // Node root = null;

        // for(int i =0; i<values.length; i++){
        //     root = insert(root, values[i]);
        // }

        // inorder(root);
        // System.out.println();

        // if (search(root, 6)) {
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not Found");
        // }

            // root = delete(root, 1);
            // System.out.println();
            // inorder(root);

            // printinRange(root, 5, 12);
            

            // if (isValidBST(root, null, null)) {
            //     System.out.println("Valid");
            // }else{
            //     System.out.println("Not valid");
            // }


            // Node root = new Node(8);
            // root.left = new Node(5);
            // root.right = new Node(10);
            // root.left.left = new Node(3);
            // root.left.right = new Node(6);
            // root.right.right = new Node(11);



            // root = createMirror(root);
            // preorder(root);

            //     int arr[] = { 3,5,6,8,10,11,12};
            // Node root = createBST(arr, 0, arr.length-1);
            // preorder(root);


             Node root = new Node(8);
            root.left = new Node(6);
            root.left.left = new Node(5);
            root.left.left.left = new Node(3);

            root.right = new Node(10);
            root.right.right = new Node(11);
            root.right.right.right = new Node(12);

            root = balancedBST(root);
            preorder(root);


    }
}
