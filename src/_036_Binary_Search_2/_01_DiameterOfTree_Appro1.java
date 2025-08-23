package _036_Binary_Search_2;
//Time complexity = O(n^2)
//Diameter of a tree approach 1  --> O(n^2)
//Diameter means --> No. of nodes in the longest path b/w 2 leaves
public class _01_DiameterOfTree_Appro1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left , right) +1 ;
    }

    public static int diameter(Node root) {  // O(n^2)
        if(root == null) {
            return 0;
        }

        int leftDia = diameter(root.left);
        int leftHei = height(root.left);
        int rightDia = diameter(root.right);
        int rightHei = height(root.right);

        int self = leftHei + rightHei + 1;
        return Math.max(self, Math.max(leftDia, rightDia));
    }

    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             /\   /\
           4  5  6  7

         */
        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node(4);
        root.left.right = new Node (5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
    }
}
/*
Output:
5
 */