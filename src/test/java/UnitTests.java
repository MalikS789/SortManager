import com.sparta.malik.Starter;
import com.sparta.malik.display.Printer;
import com.sparta.malik.sorters.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class UnitTests {

    static int[] bestArray;
    static int[] worstArray;
    static int[] averageArray;

    SortFactory sf = new SortFactory();

    @Test
    @DisplayName("Testing to see if the bubble sort ascending is working")
    public void bubbleSortAsc() {
        int[] array = new int[]{1,2,3,9,5,-1,6,7,8,4,0,10};
        Sorter sorter = sf.getSorter(SortersAvailable.BUBBLESORT);
        sorter.sortArray(array);
        Assertions.assertArrayEquals(new int[]{-1,0,1,2,3,4,5,6,7,8,9,10}, array);
    }

    @Test
    @DisplayName("Testing to see if the bubble sort descending is working")
    public void bubbleSortDesc() {
        int[] array = new int[]{1,2,3,9,5,-1,6,7,8,4,0,10};
        BubbleSort bs = new BubbleSort();
        bs.sortArray(array, "desc");
        Assertions.assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1,0,-1}, array);
    }

    @Test
    @DisplayName("Testing to see if the merge sort ascending is working")
    public void mergeSort() {
        int[] array = new int[]{1,2,3,9,5,-1,6,7,8,4,0,10};
        Sorter sorter = sf.getSorter(SortersAvailable.MERGESORT);
        sorter.sortArray(array);
        Assertions.assertArrayEquals(new int[]{-1,0,1,2,3,4,5,6,7,8,9,10}, array);
    }

    @Test
    @DisplayName("Testing to see if the binary tree sort ascending is working")
    public void BinaryTreeSortAsc() {
        int[] array = new int[]{1,2,3,9,5,-1,6,7,8,4,0,10};
        Sorter sorter = sf.getSorter(SortersAvailable.BINARYTREESORT);
        int[] newArray = sorter.sortArray(array);
        Assertions.assertArrayEquals(new int[]{-1,0,1,2,3,4,5,6,7,8,9,10}, newArray);
    }

    @Test
    @DisplayName("Testing to see if the binary tree sort descending is working")
    public void BinaryTreeSortDesc() {
        BinaryTreeImplementation bt = new BinaryTreeImplementation();
        bt.addElements(new int[]{1,2,3,9,5,-1,6,7,8,4,0,10});
        int[] result = bt.getSortedTreeDesc();
        Assertions.assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1,0,-1}, result);
    }

    @Test
    @DisplayName("Testing the performance of bubble sort Int algorithm")
    public void bubbleSortIntPerformanceTest() {
        bestArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        averageArray = Starter.generateRandomArray(30);
        worstArray = Starter.generateRandomArray(10000);

        Sorter s = sf.getSorter(SortersAvailable.BUBBLESORT);
        long start = System.nanoTime();
        s.sortArray(bestArray);
        long end = System.nanoTime();
        Printer.printMessage("Best Case Senario (Bubble Sort) : " + (end - start) / 1000000 + " milliseconds");

        start = System.nanoTime();
        s.sortArray(averageArray);
        end = System.nanoTime();
        Printer.printMessage("Average Case Senario (Bubble Sort) : " + (end - start) / 1000000 + " milliseconds");

        start = System.nanoTime();
        s.sortArray(worstArray);
        end = System.nanoTime();
        Printer.printMessage("Worst Case Senario (Bubble Sort) : " + (end - start) / 1000000 + " milliseconds");
    }

    @Test
    @DisplayName("Testing the performance of merge sort Int algorithm")
    public void mergeSortIntPerformanceTest() {
        bestArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        averageArray = Starter.generateRandomArray(30);
        worstArray = Starter.generateRandomArray(10000);

        Sorter s = sf.getSorter(SortersAvailable.MERGESORT);
        long start = System.nanoTime();
        s.sortArray(bestArray);
        long end = System.nanoTime();
        Printer.printMessage("Best Case Senario (Merge Sort) : " + (end - start) / 1000000 + " milliseconds");

        start = System.nanoTime();
        s.sortArray(averageArray);
        end = System.nanoTime();
        Printer.printMessage("Average Case Senario (Merge Sort) : " + (end - start) / 1000000 + " milliseconds");

        start = System.nanoTime();
        s.sortArray(worstArray);
        end = System.nanoTime();
        Printer.printMessage("Worst Case Senario (Merge Sort) : " + (end - start) / 1000000 + " milliseconds");
    }

    @Test
    @DisplayName("Testing the performance of binary tree sorting Int algorithm")
    public void binaryTreeIntPerformanceTest() {
        bestArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        averageArray = Starter.generateRandomArray(30);
        worstArray = Starter.generateRandomArray(10000);

        Sorter s = sf.getSorter(SortersAvailable.BINARYTREESORT);
        long start = System.nanoTime();
        s.sortArray(bestArray);
        long end = System.nanoTime();
        Printer.printMessage("Best Case Senario (Binary Tree Sort) : " + (end - start) / 1000000 + " milliseconds");

        start = System.nanoTime();
        s.sortArray(averageArray);
        end = System.nanoTime();
        Printer.printMessage("Average Case Senario (Binary Tree Sort) : " + (end - start) / 1000000 + " milliseconds");

        start = System.nanoTime();
        s.sortArray(worstArray);
        end = System.nanoTime();
        Printer.printMessage("Worst Case Senario (Binary Tree Sort) : " + (end - start) / 1000000 + " milliseconds");
    }


}
