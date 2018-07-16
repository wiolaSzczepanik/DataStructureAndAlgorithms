public class HashData {
    String key;
    String value;
    HashData next;

    HashData(String key, String value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

}
