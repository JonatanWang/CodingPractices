package LinkedLists.Common;

public class Node {

    private Node next;
    private int data;

    public Node(int data, Node next) {

        this.data = data;
        this.next = next;
    }

    int getData() {

        return data;
    }

    Node getNext() {

        return next;
    }
}
