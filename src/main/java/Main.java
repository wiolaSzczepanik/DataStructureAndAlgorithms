public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
//        System.out.println(linkedList.printList());

        linkedList.delete(30);

        System.out.println(linkedList.printList());
    }

}
