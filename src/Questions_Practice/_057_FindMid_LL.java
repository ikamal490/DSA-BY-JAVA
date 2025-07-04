package Questions_Practice;
//Find Mid-element in the LinkedList
public class _057_FindMid_LL {
    public static class  Node {
        int data;
        Node next;

        public Node(int data) {
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
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //slow-fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public static void main(String[] args) {
        _057_FindMid_LL ll = new _057_FindMid_LL();
        ll.addLast(12);
        ll.addLast(16);
        ll.addLast(23);
        ll.addLast(42);
        ll.addLast(7);
        ll.print();
        System.out.println("Middle Element: "+ll.findMid(head).data);
    }
}
/*
Output:
12-> 16-> 23-> 42-> 7-> null
Middle Element: 23
 */