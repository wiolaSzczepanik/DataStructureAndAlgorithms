public class Node {
    int data;
    public Node next;

    public Node(){}

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "" + data + "";
    }
}
