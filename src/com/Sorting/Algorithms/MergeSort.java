package com.Sorting.Algorithms;

public class MergeSort {
    public void applyMergeSort(int[] array)
    {
        if(array.length < 2)
            return;

        //Divide
        var middle = array.length / 2;

        int[] left = new int[middle];
        for(var i = 0 ; i < middle; i++)
        {
            left[i] = array[i];
        }

        int[] right = new int[array.length - middle];
        for(var i = middle; i < array.length; i++)
        {
            right[i - middle] = array[i];
        }
        //Sort

        applyMergeSort(left);
        applyMergeSort(right);

        //Merge
        merge(left, right, array);

    }

    private void merge(int[] left, int[] right, int[] result)
    {
        var i = 0;
        var j=0;
        var k=0;

        while(i < left.length && j < right.length)
        {
            if(left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while(i < left.length)
            result[k++] = left[i++];

        while(j < right.length)
            result[k++] = right[j++];
    }
}
