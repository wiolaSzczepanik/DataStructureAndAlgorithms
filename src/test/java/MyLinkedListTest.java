import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    public void testIfNodeExist(){ new Node();}

    @Test
    public void testNode(){
        Node node = new Node(10);
        assertEquals(10, node.data);
    }
    @Test
    public void testIfFirstHeadIsNull(){
        MyLinkedList linkedList = new MyLinkedList();
        assertEquals(null, linkedList.head);
    }
    @Test
    public void testAppendOneElement(){
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.append(10);
        Node number = linkedList.head;
        assertEquals(10, number.data);
    }

    @Test
    public void testAppendTwoElements(){
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.append(10);
        linkedList.append(20);
        assertEquals("10 20 ", linkedList.printList());
    }

    @Test
    public void testDeleteMethod(){
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.delete(30);
        assertEquals("10 20 40 ", linkedList.printList());

    }

}

