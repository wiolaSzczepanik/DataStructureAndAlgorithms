public class MyLinkedList {

    public Node head;

    public void append(int number) {
        if(head == null){
            head = new Node(number);
            return;
        }
        Node newNode = head;
        while(newNode.next != null){
            newNode = newNode.next;
        }
        newNode.next = new Node(number);
        return;
    }

    public String printList(){
        String result = "";
        Node newNode = head;
        while(newNode != null){
            result = result + (newNode.data+" ");
            newNode = newNode.next;
        }
        return result;
    }

    @Override
    public String toString() {
        return "" + head + "";
    }
}
