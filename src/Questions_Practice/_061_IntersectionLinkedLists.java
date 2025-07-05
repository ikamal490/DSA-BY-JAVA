package Questions_Practice;
//Intersection of Two Linked Lists
public class _061_IntersectionLinkedLists {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int size() {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public Node getIntersectionNode(Node headA,Node headB) {
        Node t1 = headA;
        Node t2 = headB;

        while(t1 != t2) {
            t1 = (t1 == null)? headA : t1.next;
            t2 = (t2 == null)? headB : t2.next;
        }
        return t1;
    }
}
