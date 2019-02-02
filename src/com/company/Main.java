package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.set(3, 22);
        list.print();
        System.out.println("\n" + list.contains(55));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.clear();
        list.print();
    }
}