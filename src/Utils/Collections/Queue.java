package Utils.Collections;

import Utils.Collections.GenericCollection;

public class Queue<T> {
    private static final int INITIAL_CAPACITY = 5;

    private GenericCollection<T> collection = new GenericCollection<T>(INITIAL_CAPACITY);

    public void enqueue(T element) {
        collection.add(element);
    }

    public T dequeue() {
        return (T) collection.delete(0);
    }

    public void showAll(){
        for (int i = 0; i < collection.length(); i++) {
            System.out.println(collection.getElement(i));
        }
    }
}
