package com.example;

import java.util.ArrayList;

import com.example.sorts.comparison.InsertionSort;

public class Main {
    private static ArrayList<Integer> generateUnsortedData(int size) {
        ArrayList<Integer> unsortedData = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int randomNum = (int) (Math.random() * 101);
            unsortedData.add(randomNum);
        }
        return unsortedData;
    }

    public static void main(String[] args) {
        ArrayList<Integer> unsortedData = generateUnsortedData(6);
        System.out.println("Unsorted List: " + unsortedData);

        // BubbleSort bubbleSort = new BubbleSort(unsortedData);
        // System.out.println("sorted List: " + bubbleSort.sort());

        InsertionSort insertionSort = new InsertionSort(unsortedData);
        System.out.println("sorted List: " + insertionSort.sort());
        

    }
}

// This website is helpful in understanding how each sort works
// https://www.cs.usfca.edu/~galles/visualization/ComparisonSort.html

// Comparison Sorts
// Bubble, Insertion, Selection

// sortedIndex: array index that is sorted starts at 0 (Color from begginning of
// list to here green)
// nextElement: Next item to be sorted/compared
// swappedElement: Item that the nextElement is being swapped with

// EX: Insertion Sort {1, 2, 9, 4, 3, 6}
// sortedIndex = 1 {1,2, ...}
// nextElement = 3 (9 is not smaller than 1 or 2 but 4 is smaller than 9)
// swappedElement = 2

// Import java.utils for arraylists
// Divide and Conquer Sorts

// Quick
// pivot: index of pivot

// merge
//

// Heap Sort
