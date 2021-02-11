import com.sparta.malik.sorters.BubbleSort;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class UnitTests {

    static int[] bestArray;
    static int[] worstArray;
    static int[] averageArray;

    @Before
    public void setUp() {
        bestArray = new int[]{1,2,3,4,5,6,7,8,9};
        averageArray = new int[]{1, 2, 7, 5, 6, 3, 4, -1, 6, 2};
        worstArray = new int[]{2, 1, 7, 5, 9, 3, 6, -1, 8, 2};
    }

    @Test
    @DisplayName("Testing the performance of bubble sort Int algorithm")
    public void bubbleSortIntPerformanceTest() {

    }

    @Test
    @DisplayName("Testing the performance of merge sort Int algorithm")
    public void mergeSortIntPerformanceTest() {

    }

    @Test
    @DisplayName("Testing the performance of binary tree sorting Int algorithm")
    public void binaryTreeIntPerformanceTest() {

    }

    @Test
    @DisplayName("Testing the performance of bubble sort String algorithm")
    public void bubbleSortStringPerformanceTest() {

    }

    @Test
    @DisplayName("Testing the performance of merge sort String algorithm")
    public void mergeSortStringPerformanceTest() {

    }

    @Test
    @DisplayName("Testing the performance of binary tree sorting String algorithm")
    public void binaryTreeStringPerformanceTest() {

    }




}
