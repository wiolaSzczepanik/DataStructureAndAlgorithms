import static java.lang.Math.abs;

public class MyHashTable {

    private int size = 16;
    private HashData[] data;

    public MyHashTable(){
        data = new HashData[size];
    }

    public void put(String key, String value) {
        int index = getIndex(key);

        HashData entry = new HashData(key, value);

        if (data[index] == null) { // fist element in linkedList
            data[index] = entry;
        } else { //collision
            HashData entries = data[index];
            while (entries.next != null) {
                entries = entries.next;
            }
            entries.next = entry;
        }
    }

    public String get(String key) {

        int index = getIndex(key);
        HashData entries = data[index];

        if(entries != null){
            while(!entries.key.equals(key) && entries.next != null){
                entries = entries.next;
            }
            return entries.value;
        }

        return null;
    }

    private int getIndex(String key) {
        int hashCode = key.hashCode();
        int index = abs(hashCode % size);

        if(key.equals("John Smith") || key.equals("Sandra Doe")){ // try to create collision
            index = 4;
        }
        return index;
    }
}
