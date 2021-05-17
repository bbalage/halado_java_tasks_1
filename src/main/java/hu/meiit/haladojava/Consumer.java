package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreEmptyException;

public class Consumer {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public Product consume(int index) throws StoreEmptyException {
        return store.remove(index);
    }
}
