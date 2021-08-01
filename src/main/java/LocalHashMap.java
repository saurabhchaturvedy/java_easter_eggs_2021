public class LocalHashMap {


    private class HashNode {
        Integer key;
        String value;
        HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public LocalHashMap(int capacity) {

        this.numOfBuckets = capacity;
        this.buckets = new HashNode[capacity];
        this.size = 0;
    }


    public LocalHashMap() {
        this(10);
    }


    private int size() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
