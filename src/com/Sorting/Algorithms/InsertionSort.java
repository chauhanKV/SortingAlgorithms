package com.Sorting.Algorithms;

public class InsertionSort {
    public void applyInsertionSortAlgorithm(int[] array)
    {
        for(var i = 0 ; i < array.length; i++)
        {
            var current = array[i];
            var insertionIndex = 0;
            for(var j = i ; j >= 0; j--)
            {
                if(current < array[j])
                {
                    array[j+1] = array[j];
                    insertionIndex = j;
                }
            }
            array[insertionIndex] = current;
        }
    }
}
