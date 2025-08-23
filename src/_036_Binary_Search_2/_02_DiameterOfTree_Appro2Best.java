package _036_Binary_Search_2;
//Time complexity: O(n)
//Diameter of a tree Best Approach -- O(n)
public class _02_DiameterOfTree_Appro2Best {
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
    static class Info {
        int diam;
        int ht;

        public Info(int dia, int ht) {
            this.diam = dia;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root) {
        if(root == null) {
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int self = leftInfo.ht + rightInfo.ht +1;

        int dia = Math.max(self, Math.max(leftInfo.diam, rightInfo.diam));
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(dia, ht);
    }

    public static void main(String[] args) {
        Node root = new Node ( 1);
        root.left = new Node ( 2);
        root.right = new Node ( 3);
        root.left.left = new Node( 4);
        root.left.right = new Node ( 5);
        root.right.left = new Node ( 6);
        root.right.right = new Node ( 7);

        System.out.println(diameter(root).diam);
    }
}
/*
Output:
5
 */