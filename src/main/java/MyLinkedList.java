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
            result = String.format("%s%s", result, newNode.data + " ");
            newNode = newNode.next;
        }
        return result;
    }

    @Override
    public String toString() {
        return "" + head + "";
    }

    public void delete(int number) {
        if(head == null) return;

        Node newNode = head;
        while(newNode.next != null){
            if(newNode.next.data == number){
                newNode.next= newNode.next.next;
                return;
            }else
                newNode =newNode.next;
            }
        }
    }

