public class zigzagLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addNodeFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void zigzag(){
        if(head == null || head.next == null){
            return;
        }
        // find mid node 
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        
        Node prev= null;
        Node curr= mid.next;
        mid.next = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextRight;
        Node nextLeft;

        while(left!= null && right != null){
            nextLeft= left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            right = nextRight;
            left = nextLeft;
        }
    }
    public static void main(String[] args) {
        zigzagLL ll = new zigzagLL();
        ll.addNodeFirst(1);
        ll.addNodeFirst(2);
        ll.addNodeFirst(3);
        ll.addNodeFirst(4);
        ll.addNodeFirst(5);
        ll.print();
        ll.zigzag();
        ll.print();
    }
}
