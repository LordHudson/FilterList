package com.company;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListFiltererDeclarativeTest {

    @org.junit.jupiter.api.Test
    void filteredList() {
        assertEquals(Arrays.asList(1, 2), ListFiltererDeclarative.filteredList(Arrays.asList(new Object[]{1, 2, "a", "b"})));
        assertEquals(Arrays.asList(1, 2,0,15), ListFiltererDeclarative.filteredList(Arrays.asList(new Object[]{1, 2, "a", "b", 0, 15})));
        assertEquals(Arrays.asList(1, 2,231), ListFiltererDeclarative.filteredList(Arrays.asList(new Object[]{1, 2, "a", "b", "aasf", "1", "123", 231})));
    }
}