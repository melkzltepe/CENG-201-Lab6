public class MyStack {
    Node head;
    Node middle;
    int size;

    public MyStack() {
        this.head = null;
        this.middle = null;
        this.size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
        if (size == 1){
            middle = newNode;
        } else if (size % 2 != 0) {
            middle = middle.prev;
        }

    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        int value = head.data;
        head = head.next;
        if (head != null){
            head.prev = null;
        }
        size--;
        if (size % 2 == 0 && middle != null) {
            middle = middle.next;
        }
        return value;
    }

    public void printStack() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printMiddle(){
        System.out.println("Middle: " + middle.data);
    }

    public int deleteMiddle() {
        if (middle == null) {
            return -1;
        }
        int value = middle.data;
        middle.next.prev = middle.prev;
        middle.prev.next = middle.next;
        if (size % 2 == 0 && head != null) {
            middle = middle.next;
        }else {
            middle = middle.prev;
        }
        size--;
        return value;
    }
}
