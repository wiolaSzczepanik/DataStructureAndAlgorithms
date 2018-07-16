import java.util.Arrays;

public class Stack {
    public static final int CAPACITY=1000;// deafulotwa wielkosc
    private int actualCapacity;// aktualna wielkosc stostu (teraz mamy 0)
    private Object[] array; // typ jaki array przyjmuje
    private int topElement = -1;


    public Stack(){
        this(CAPACITY);
    }
    public Stack(int CAP){
        actualCapacity = CAP;
        array = new Object[actualCapacity];
    }

    public int find(){ // metoda zwraca index szukanego elementu
        return (topElement + 1);
    }

    public Object peek(){ //metoda zwraca obiekt ktory jest pierwszy na stosie
        return array[topElement];
    }

    public boolean isEmpty(){
        return (topElement<0);
    }

    public boolean isFull(){
        return (topElement>actualCapacity);
    }

    public void push(Object object){ // push==add
        if(actualCapacity == find()){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(isFull()){
            throw new StackOverflowError();
        }
        topElement++;
        array[topElement]=object;
        actualCapacity--;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stuck is empty");
        }
        array[topElement]=null;
        topElement--;
        actualCapacity++;
    }

    public int size(){
        return CAPACITY-actualCapacity;
    }

    public int freeSpace(){
        return CAPACITY -(CAPACITY-actualCapacity);
    }

    @Override
    public String toString() {
        int actualSize = CAPACITY-actualCapacity;
        Object[] newArray = new Object[actualSize];

        for(int i=0; i<actualSize; i++){
            newArray[i]=array[i];
        }
        return Arrays.toString(newArray);
    }
}