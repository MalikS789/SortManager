package com.sparta.malik.sorters;

public class SortFactory {

    public Sorter getSorter(SortersAvailable name) {
        switch (name) {
            case MERGESORT:
                return new MergeSort();
            case BUBBLESORT:
                return new BubbleSort();
            case BINARYTREESORT:
                return new BinaryTreeImplementation();
        }
        return null;
    }

}
