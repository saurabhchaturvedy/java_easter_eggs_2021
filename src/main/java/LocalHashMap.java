import java.util.Arrays;

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


    private void put(Integer key, String value) {

        if (key == null)
            return;

        int hashcode = hashcode(key);
        HashNode head = buckets[hashcode];

        while (head != null) {

            if (head.key.equals(key)) {
                head.value = value;
                return;
            }

            head = head.next;
        }
        size++;
        head = buckets[hashcode];  // reset head back to start as it might have travelled in search of putting a node .
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        buckets[hashcode] = newNode;
    }


    private String get(Integer key) {
        if (key == null) {
            throw new RuntimeException("pass a non-null key");
        }

        int hashcode = hashcode(key);
        HashNode head = buckets[hashcode];

        while (head != null) {

            if (head.key.equals(key)) {
                return head.value;
            }

            head = head.next;
        }

        return null;
    }


    private String remove(Integer key) {
        if (key == null) {
            throw new RuntimeException("pass a non-null key");
        }

        int hashcode = hashcode(key);
        HashNode head = buckets[hashcode];
        HashNode previous = null;

        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }

            previous = head;
            head = head.next;
        }

        if (head == null) {
            return null;
        }
        size--;

        if (previous != null) {
            previous.next = head.next;
        } else {
            buckets[hashcode] = head.next;
        }

        return head.value;
    }


    private int hashcode(Integer key) {
        return Math.abs(key.hashCode()) % numOfBuckets;
    }

    @Override
    public String toString() {
        return "LocalHashMap{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }

    public static void main(String[] args) {

        LocalHashMap localHashMap = new LocalHashMap();
        localHashMap.put(1, "john");
        localHashMap.put(2, "stan");
        localHashMap.put(3, "joe");

        System.out.println("size of map is : " + localHashMap.size());

        System.out.println("value is : " + localHashMap.get(2));

        localHashMap.remove(2);

        System.out.println("size of map is : " + localHashMap.size());

        System.out.println(localHashMap);
    }
}
