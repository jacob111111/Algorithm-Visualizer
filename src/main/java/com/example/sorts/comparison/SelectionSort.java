package com.example.sorts.comparison;

import java.util.ArrayList;
import java.util.Collections;

import com.example.sorts.AbstractSort;

public class SelectionSort extends AbstractSort {
    public SelectionSort(ArrayList<Integer> unsortedList) {
        super(unsortedList);
    }

    @Override
    public ArrayList<Integer> sort() {
        ArrayList<Integer> sortedList = new ArrayList<>(unsortedList);

        for (int i = 0; i < sortedList.size(); i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < sortedList.size(); j++) {
                if (sortedList.get(j) < sortedList.get(i)) {
                    smallestIndex = j;
                }
            }
            System.out.println("smallestIndex: " + "\u001B[43m" + smallestIndex + "\u001B[0m" + sortedList + "\n");
            Collections.swap(sortedList, i, smallestIndex);
        }
        return sortedList;
    }
}
