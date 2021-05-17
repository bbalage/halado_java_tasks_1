package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreEmptyException;

public class Consumer {
    private Store store = new Store();

    public Product consume(int index) throws StoreEmptyException {
        return store.remove(index);
    }
}
