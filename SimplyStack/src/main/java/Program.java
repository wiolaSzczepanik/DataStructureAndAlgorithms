import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("The stack is empty: " + stack.isEmpty());

        stack.push("a");
        System.out.println("The stack is empty: " + stack.isEmpty());
        System.out.println("First element is: " + stack.peek() );
        System.out.println("Size: " + stack.size());
        System.out.println("Free space: " + stack.freeSpace());


        stack.push("A");
        System.out.println("First element is: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Free space: " + stack.freeSpace());


        stack.push("1");
        System.out.println("First element is: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Free space: " + stack.freeSpace());
        System.out.println(stack.toString());


        stack.pop();
        System.out.println("First element is: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Free space: " + stack.freeSpace());






    }
}
