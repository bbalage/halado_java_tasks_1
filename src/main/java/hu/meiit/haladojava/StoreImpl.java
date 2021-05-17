package hu.meiit.haladojava;

import hu.meiit.haladojava.exceptions.StoreEmptyException;
import hu.meiit.haladojava.exceptions.StoreFullException;

import java.util.ArrayList;
import java.util.List;

public class StoreImpl implements StoreReader, StoreWriter{
    private static final int DEFAULT_STORE_CAPACITY = 10;
    private int storeCapacity = DEFAULT_STORE_CAPACITY;
    private List<Product> productList = new ArrayList<>();

    public void add(Product product) throws StoreFullException {
        if (productList.size() == storeCapacity) {
            throw new StoreFullException();
        }
        productList.add(product);
    }

    public Product remove(int index) throws StoreEmptyException {
        if (productList.isEmpty()) {
            throw new StoreEmptyException();
        }
        return productList.remove(index);
    }

    public void reset() {
        productList.clear();
    }

    public int getProductCount() {
        return productList.size();
    }

    public int getStoreCapacity() {
        return storeCapacity;
    }

    public void setStoreCapacity(int storeCapacity) {
        this.storeCapacity = storeCapacity;
    }
}
