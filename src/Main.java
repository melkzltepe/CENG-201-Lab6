public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(3);
        myStack.push(5);
        myStack.push(7);
        myStack.push(8);
        myStack.push(6);
        myStack.push(9);
        myStack.printStack();
        System.out.println("Deleted item: " + myStack.deleteMiddle());
        myStack.printStack();
        myStack.printMiddle();
    }
}