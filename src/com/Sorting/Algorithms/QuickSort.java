package com.Sorting.Algorithms;

public class QuickSort {

    public void applyQuickSortAlgorithm(int[] array)
    {
        quickSortAlgorithm(array, 0, array.length - 1);
    }

    private void quickSortAlgorithm(int[] array, int start, int end)
    {
        if(start >= end)
            return;
        //Partition
        var boundary = partition(array, start, end);
        //Sort Left
        quickSortAlgorithm(array, start, boundary - 1);
        //Sort right
        quickSortAlgorithm(array, boundary + 1, end);
    }

    private int partition(int[] array , int start, int end)
    {
        var pivot = array[end];
        var boundary = start - 1;
        for(var i = start ; i <= end; i++)
        {
           if(array[i] <= pivot)
               swap(array, i , ++boundary);
        }
        return boundary;
    }

    private void swap(int[] array, int index, int boundary)
    {
        var temp = array[boundary];
        array[boundary] = array[index];
        array[index] = temp;
    }

}
