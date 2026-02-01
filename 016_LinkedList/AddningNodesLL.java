
public class AddningNodesLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addNodeFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail= newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addNodeLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head= tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addNodeMiddle(int data , int idx){

        if(idx ==0){
            addNodeFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){

        if(size ==0){
            System.out.println("LL is empty");
            return -1;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size == 0) {
            System.out.println("LL is empty");
            return -1;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
       for(int i=0; i<size-2; i++){
        prev = prev.next;
       }

        int val = prev.data;
        prev.next = null;
        size--;
        return val;
    }
    
    public void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int searchIterative(int key){
        Node temp = head;
        for(int i=0; i<size; i++){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx= helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node Next;

        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        head = prev;
    }

    public void findAndRemoveNthNode(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(size == n){
            head = head.next;
            return;
        }

        int i=0;
        Node prev = head;
        while(i<size-n-1){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = findMidNode(head);

        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

        // floyd's cycle detecting method
    public boolean detectCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast= fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        AddningNodesLL ll = new AddningNodesLL();

        ll.addNodeFirst(2);
        ll.addNodeFirst(1);
        ll.addNodeLast(4);
        ll.addNodeLast(5);
        ll.addNodeMiddle(3, 2);
        //ll.removeFirst();
        //ll.removeLast();
        //System.out.println(ll.recSearch(3));
        //ll.findAndRemoveNthNode(3);
        //ll.printLL(head);
        //ll.reverseLL();
        //ll.printLL(head);
        System.out.println("size "+size);
        System.out.println(ll.checkPalindrome());

    }
}
