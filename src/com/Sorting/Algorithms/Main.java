package com.Sorting.Algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        bubbleSort.applyBubbleSorting(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}