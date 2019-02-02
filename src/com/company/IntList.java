package com.company;

public interface IntList {
    void add(int value);
    int get(int index);
    void resize(int newLength);
    void clear();
    boolean contains(int value);
    boolean isEmpty();
    void set(int index, int element);
    int size();
    void print();
}
