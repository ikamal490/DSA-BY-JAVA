package _030_LinkedLists;

public class Linked_List {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head; //link
        head = newNode;
    }


    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) { //It means LinkedList is empty
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size --;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key) { //time Complexity = O(n)
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) { //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    public int helper(Node head, int key) { //Time Complexity: O(n)
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
            if(idx == -1) {
                return -1;
            }
            return idx+1;
    }
    public int recursiveSearch(int key) {
        return helper(head,key);
    }

    //3 variable 4 step
    public void reverse() { //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Remove Nth Node from end
    public void deleteNthfromEnd(int n) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        //corner case:
        if(n == sz) {  //If's head delete
            head = head.next; //removeFirst
            return;
        }

        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }


    //Slow-Fast Approach:
    public Node findMid(Node head) { //here,Node is the return type
        Node slow = head;  //+1 at a time
        Node fast = head;  // +2 at a time

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1  turtle
            fast = fast.next.next; //+2  hare
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome() {
        //base case:
        if(head == null || head.next == null) {
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head;

        //step3 - check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static boolean isCycle() { //Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast) {
                return true; //cycle exists
            }
        }
        return false; //cycle doesn't exists
    }

    public static void removeCycle() {
        //detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow) {
                    cycle = true;
                    break;
                }
            }
            if(cycle == false) {
                return;
            }

        //find meeting point
            slow = head;
            Node prev = null;
            while(slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

        //remove cycle -> last.next = null
        prev.next = null;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node head2) {
        //head1 - leftHead  || head2  - rightHead
        Node mergedLL = new Node(-1); //Initialize with dummy node
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head) { //O(nlogn)
        if(head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        //find mind
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alternate merge - zig-zag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }


    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.addMiddle(2,3);
//        ll.print();

//        System.out.println("size of LL "+ ll.size);
//        ll.removeFirst();
//        ll.print();
//        System.out.println("size of LL "+ ll.size);
//        ll.removeLast();
//        ll.print();
    /*
Output of remove first and last:
1-> 2-> 3-> 4-> 5-> null
size of LL 5
2-> 3-> 4-> 5-> null
size of LL 4
2-> 3-> 4-> null
     */


//        System.out.println("Key found at index: "+ll.iterativeSearch(3));
//        System.out.println("Key found at index: "+ll.iterativeSearch(31));
    /*
Output of iterative Search:
1-> 2-> 3-> 4-> 5-> null
Key found at index: 2
Key found at index: -1
     */


//        System.out.println("Key found at index: "+ll.recursiveSearch(5));
//        System.out.println("Key found at index: "+ll.recursiveSearch(6));
            /*
Output of recursive Search:
1-> 2-> 3-> 4-> 5-> null
Key found at index: 4
Key found at index: -1
     */


//        ll.reverse();
//        ll.print();
        /*
reverse Output:
1-> 2-> 3-> 4-> 5-> null
5-> 4-> 3-> 2-> 1-> null
         */


//        ll.deleteNthfromEnd(3);
//        ll.print();
//        ll.deleteNthfromEnd(1);
//        ll.print();
        /*
DeleteNth fromEnd--
1-> 2-> 3-> 4-> 5-> null
1-> 2-> 4-> 5-> null
1-> 2-> 4-> null
         */


//        System.out.println(ll.checkPalindrome());
        /*
Output:check Palindrome
1-> 2-> 3-> 4-> 5-> null
false
         */


//        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = head; // 1->2->3->1
//        System.out.println(isCycle());
        /*
        Output of isCycle:
        true
         */


//        head = new Node(1);
//        Node temp = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp; // 1->2->3->2
//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());
        /*
Output removeCycle:
true
false
         */


//        ll.addFirst(1);
//        ll.addFirst(2);
//        ll.addFirst(3);
//        ll.addFirst(4);
//        ll.addFirst(5);
//        ll.print();
//        ll.head = ll.mergeSort(ll.head);
//        ll.print();
        /*
Output: merge sort
5-> 4-> 3-> 2-> 1-> null
1-> 2-> 3-> 4-> 5-> null
         */

//        ll.zigZag();
//        ll.print();
        /*
        Output:
        Zig Zag Problem
        1-> 2-> 3-> 4-> 5-> null
        1-> 5-> 2-> 4-> 3-> null
         */
    }
}
