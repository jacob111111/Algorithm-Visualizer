package com.example.sorts.comparison;

import java.util.ArrayList;
import java.util.Collections;

import com.example.sorts.AbstractSort;

public class InsertionSort extends AbstractSort {
    public InsertionSort(ArrayList<Integer> unsortedList) {
        super(unsortedList);
    }

    @Override
    public ArrayList<Integer> sort() {
        ArrayList<Integer> sortedList = new ArrayList<>(unsortedList);
        
        
        for (int crnt = 1; crnt < sortedList.size(); crnt++) {
            int prev = crnt-1;

            int tempcrnt = crnt;
            while(sortedList.get(tempcrnt) < sortedList.get(prev)) {
                Collections.swap(sortedList, prev, tempcrnt);
                System.out.println("step: " + "\u001B[43m"+crnt+ "\u001B[0m" + sortedList + "\n");
                if(prev==0) {break;}
                tempcrnt--;
                prev--;
            }
        }

        return sortedList;
    }
}
