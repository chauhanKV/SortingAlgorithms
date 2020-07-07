package com.Sorting.Algorithms;

public class SelectionSort {
    public void applySelectionSortAlgorithm(int[] array)
    {
        for(var i = 0 ; i < array.length; i++)
        {
            var minIndex = i;
            for(var j = i ; j < array.length; j++)
            {
                if(array[j] < array[minIndex])
                {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private void swap(int[] array,int index,int minIndex)
    {
        var temp = array[index];
        array[index] = array[minIndex];
        array[minIndex] = temp;
    }
}
