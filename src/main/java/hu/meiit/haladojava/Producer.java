package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreFullException;

public class Producer {
    private final StoreWriter store;

    public Producer(StoreWriter store) {
        this.store = store;
    }

    public void produce() throws StoreFullException {
        store.add(new Product("product", 1));
    }
}
