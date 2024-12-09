package interfaces.impl;

import interfaces.GenericInterface;

public class GenericInterfaceImpl <T> implements GenericInterface<T> {

    @Override
    public void display(T value) {
        System.out.println("Value: " + value);
    }
}
