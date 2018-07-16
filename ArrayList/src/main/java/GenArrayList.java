public class GenArrayList <T>{
    private static final int CAPACITY = 10;
    private Object[] data;
    private int size; //length of array
    private int length; // actual number of elements

    public GenArrayList(){
        this.data = new Object[CAPACITY];
        this.size = CAPACITY;
    }

    public void add(T obj){
        if(length == size-1){
            increaseSize();
        }
        data[length]= obj;
    }

    private void increaseSize() {
        this.size = CAPACITY * 2 ;
        Object newData
    }


}
