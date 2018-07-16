import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashTableTest {


    private MyHashTable hashTable;

    @BeforeEach
    public void setUp() throws Exception {
        hashTable = new MyHashTable();
    }

    @Test
    public void PutAndGet() {
        hashTable.put("John Smith", "521-1234");
        hashTable.put("Lisa Smith", "521-8976");
        hashTable.put("Sam Doe", "521-5030");
        hashTable.put("Sandra Dee", "521-9655");
        hashTable.put("Ted Baker", "418-4165");

        assertEquals("521-1234", hashTable.get("John Smith"));
        assertEquals("521-8976", hashTable.get("Lisa Smith"));
        assertEquals("521-5030", hashTable.get("Sam Doe"));
        assertEquals("521-9655", hashTable.get("Sandra Dee"));
        assertEquals("418-4165", hashTable.get("Ted Baker"));

        hashTable.toString();
    }

    @Test
    public void Collision() {
        // these keys will collide
        hashTable.put("John Smith", "521-1234");
        hashTable.put("Sandra Dee", "521-9655");

        assertEquals("521-1234", hashTable.get("John Smith"));
        assertEquals("521-9655", hashTable.get("Sandra Dee"));
    }
}

