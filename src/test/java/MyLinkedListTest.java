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
}