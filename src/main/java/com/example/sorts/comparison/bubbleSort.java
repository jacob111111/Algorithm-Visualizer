package com.example.sorts.comparison;

import java.util.ArrayList;
import com.example.sorts.AbstractSort;

public class BubbleSort extends AbstractSort {
    public BubbleSort(ArrayList<Integer> unsortedList) {
        super(unsortedList);
    }

    @Override
    public ArrayList<Integer> sort() {
        ArrayList<Integer> sortedList = new ArrayList<>(unsortedList);

        for (int i = 0; i < sortedList.size() - 1; i++) {
            for (int j = 0; j < sortedList.size() - i - 1; j++) {
                if (sortedList.get(j) > sortedList.get(j + 1)) {
                    System.out.println("step: " + i + sortedList + "\n");
                    int temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
        }

        return sortedList;
    }
}
