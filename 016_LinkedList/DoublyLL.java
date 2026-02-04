public class DoublyLL {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            tail = head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        
    }

    public void removeFirst(){
        if(head == null || head.next == null){
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        
        if(tail == null){
            tail = head = newNode;
        }else{
             newNode.prev = tail;
             tail.next = newNode;
             tail = newNode;
        }
    }

    public void removeLast(){
        if(head == null || head.next == null){
            head =tail =null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.removeFirst();

        dll.print();
    }
}
