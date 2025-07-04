package Questions_Practice;
//check Palindrome LinkedList
public class _058_checkPalindrome {
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
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        //base condition:
        if(head == null || head.next == null) {
            return true;
        }

        //Step1: Find Mid
        Node midNode = findMid(head);

        //Step2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head (reversed list)
        Node left = head;  // left half head (original list)

        //step3: check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        _058_checkPalindrome ll = new _058_checkPalindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
//        System.out.println("Middle element: "+ll.findMid(head).data);
        System.out.println(ll.checkPalindrome());

    }
}
/*
Output:
1-> 2-> 3-> 2-> 1-> null
true
 */