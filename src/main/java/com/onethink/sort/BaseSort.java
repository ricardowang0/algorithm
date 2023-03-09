package com.onethink.sort;

public abstract class BaseSort {

    public abstract <E extends Comparable<E>> void sort(E[] a);

    public static <E> void swap(E[] a, int min, int i) {
        E temp = a[min];
        a[min] = a[i];
        a[i] = temp;
    }

}
