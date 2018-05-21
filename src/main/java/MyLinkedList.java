public class MyLinkedList {

    public Node head;

    public void append(int number) {
        if(head == null){
            head = new Node(number);
            return;
        }
    }

    @Override
    public String toString() {
        return "" + head + "";
    }
}
