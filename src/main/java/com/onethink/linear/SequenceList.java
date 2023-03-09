package com.onethink.linear;

import java.io.File;

/**
 *
 */
public class SequenceList<T> {

    private T[] elements;
    private int size;


    public SequenceList(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    public void add(T t) {
        if (elements.length == size) {
            //扩容
            grow(2 * size);
        }
        elements[size] = t;
    }

    private void grow(int newSize) {
        T[] temp = (T[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            temp[i] = elements[i];
        }
        elements = temp;
    }
}
