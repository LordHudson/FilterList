package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFiltererImperative {

    public static void main(String[] args) {

        System.out.println(filteredList(Arrays.asList(1,2,"a", "b")));
        System.out.println(filteredList(Arrays.asList(1,2,"a", "b",0,15)));
        System.out.println(filteredList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)));

    }

    public static List<Object> filteredList(final List<Object> list) {

        List<Object> integers = new ArrayList<>();

        for (Object o : list) {
            if (o instanceof Integer) {
                integers.add(o);
            }
        }
        return integers;
    }
}
