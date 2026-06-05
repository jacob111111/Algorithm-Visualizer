package com.example.sorts;

import java.util.ArrayList;

public abstract class AbstractSort {
    protected ArrayList<Integer> unsortedList;

    public AbstractSort(ArrayList<Integer> unsortedData) {
        this.unsortedList = unsortedData;
    }

    public abstract ArrayList<Integer> sort();
}
