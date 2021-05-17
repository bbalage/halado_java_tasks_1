package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreEmptyException;
import hu.meiit.haladojava.exceptions.StoreFullException;

public interface Store {
    void add(Product product) throws StoreFullException;
    Product remove(int index) throws StoreEmptyException;
    void reset();
    int getProductCount();
}
