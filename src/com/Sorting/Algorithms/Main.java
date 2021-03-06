package com.Sorting.Algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        bubbleSort.applyBubbleSorting(numbers);
        System.out.println("======= Bubble Sort =======");
        System.out.println(Arrays.toString(numbers));

        SelectionSort selectionSort = new SelectionSort();
        System.out.println("======= Selection Sort =======");
        numbers = new int[]{7, 3, 1, 4, 6, 2, 3};
        selectionSort.applySelectionSortAlgorithm(numbers);
        System.out.println(Arrays.toString(numbers));

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("======= Insertion Sort =======");
        numbers = new int[]{7, 3, 1, 4, 6, 2, 3};
        insertionSort.applyInsertionSortAlgorithm(numbers);
        System.out.println(Arrays.toString(numbers));

        MergeSort mergeSort = new MergeSort();
        System.out.println("======= Merge Sort =======");
        numbers = new int[]{7, 3, 1, 4, 6, 2, 3};
        mergeSort.applyMergeSort(numbers);
        System.out.println(Arrays.toString(numbers));

        QuickSort quickSort = new QuickSort();
        System.out.println("======== Quick Sort =======");
        numbers = new int[]{15,6,3,1,22,10,13};
        quickSort.applyQuickSortAlgorithm(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}