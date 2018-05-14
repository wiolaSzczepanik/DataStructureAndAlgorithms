import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void pushObjects(){
        Stack stack = new Stack();
        stack.push(32);
        stack.push(42);
        String result = "[32, 42]";
        assertEquals(result, stack.toString());
    }

    @Test
    public void freeSpace(){
        Stack stack = new Stack();
        stack.push(32);
        stack.push(42);
        int result = 998;
        assertEquals(result, stack.freeSpace());
    }

    @Test
    public void popObjects(){
        Stack stack = new Stack();
        stack.push(32);
        stack.push(42);
        stack.push(56);
        stack.push(100);
        stack.pop();
        stack.pop();
        String result = "[32, 42]";
        assertEquals(result, stack.toString());
    }


}