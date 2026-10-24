class Node {
    Node next;
    int value;
    int min;

    Node(int value, int min) {
        this.value = value;
        this.min = min;
        this.next = null;
    }
}

class MinStack {

    Node top;

    public MinStack() {
        top = null;
    }

    public void push(int val) {

        if (top == null) {
            top = new Node(val, val);
            return;
        }

        int minimum = Math.min(val, top.min);

        Node newNode = new Node(val, minimum);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {

        if (top == null) {
            return;
        }

        top = top.next;
    }

    public int top() {

        if (top == null) {
            return -1;
        }

        return top.value;
    }

    public int getMin() {

        if (top == null) {
            return -1;
        }

        return top.min;
    }
}