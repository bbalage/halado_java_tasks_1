package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreFullException;

public class Producer {
    private Store store = new Store();

    public void produce() throws StoreFullException {
        store.add(new Product("product", 1));
    }
}
