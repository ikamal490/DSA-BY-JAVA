package Questions_Practice;
//Remove Nth Node From End of List
public class _056_RemoveNthNodeEnd {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
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
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void removeNthNode(int n){
        //calculate the size inside the func-
//        int sz = 0;
//        Node temp = head;
//        while(temp != null) {
//            temp = temp.next;
//            sz++;
//        }

        //corner case:
        if(size == n) {
            head = head.next;
            return;
        }

        //size - n
        int i = 1;
        Node prev = head;
        int iFind = size-n;
        while(i < iFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;
    }

    public static void main(String[] args) {
        _056_RemoveNthNodeEnd ll = new _056_RemoveNthNodeEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        removeNthNode(7);
        ll.print();
    }
}
/*
Output:
1-> 2-> 3-> 4-> 5-> 6-> 7-> null
2-> 3-> 4-> 5-> 6-> 7-> null
 */