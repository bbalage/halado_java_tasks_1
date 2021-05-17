package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreFullException;

public class Producer {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void produce() throws StoreFullException {
        store.add(new Product("product", 1));
    }
}
