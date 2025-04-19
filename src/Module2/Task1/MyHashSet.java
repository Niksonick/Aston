package Module2.Task1;

import java.util.LinkedList;
import java.util.List;

public class MyHashSet<E> {
    private static final int DEFAULT_CAPACITY = 16;
    private List<E>[] buckets;
    private int size;

    public MyHashSet() {
        buckets = new List[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E element) {
        int bucketIndex = getBucketIndex(element);
        List<E> bucket = buckets[bucketIndex];

        if (bucket.contains(element)) {
            return false;
        }

        bucket.add(element);
        size++;
        return true;
    }

    public boolean remove(E element) {
        int bucketIndex = getBucketIndex(element);
        List<E> bucket = buckets[bucketIndex];

        boolean removed = bucket.remove(element);
        if (removed) {
            size--;
        }
        return removed;
    }

    private int getBucketIndex(E element) {
        return Math.abs(element.hashCode()) % buckets.length;
    }

    public int size() {
        return size;
    }
}