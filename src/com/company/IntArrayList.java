package com.company;

public class IntArrayList implements IntList {
    private int[] array = new int[16];
    private int count = 0;

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void add(int value) {
        if (count == array.length - 1)
            resize(array.length * 3 / 2 + 1); // увеличу, если достигли границ
        array[count++] = value;
    }

    @Override
    public int size() {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void resize(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(array, 0, newArray, 0, count);
        array = newArray;
    }

    @Override
    public void set(int index, int element) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = array[i];
            }
        }
        array = newArray;
    }

    @Override
    public boolean isEmpty() {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                counter++;
            }
        }
        if (counter == 0) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean contains(int value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++;
            }
        }
        if (counter == 0) {
            return false;
        } else
            return true;
    }

    @Override
    public void clear() {
        int[] newArray = new int[array.length];
        array = newArray;
    }

    @Override
    public void print() {
        for (int i = 0; i < 6; i++) {
            System.out.print(get(i) + " ");
        }
    }
}
