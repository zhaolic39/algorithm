package sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Zhao Li on 2017/4/14.
 */
public class SortTest {
    Integer[] array = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};


    @Test
    public void quickSort(){
        QuickSort sort = new QuickSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void quickSort2(){
        QuickSort2 sort = new QuickSort2();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void bubbleSort(){
        BubbleSort sort = new BubbleSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void insertSort(){
        InsertSort sort = new InsertSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void selectionSort(){
        SelectionSort sort = new SelectionSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void mergeSort(){
        MergeSort sort = new MergeSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
