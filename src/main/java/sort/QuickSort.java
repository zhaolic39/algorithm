package sort;

import java.util.Arrays;

/**
 * Created by Zhao Li on 2017/4/13.
 */
public class QuickSort implements Sorting{

    public static void main(String[] args){
        Integer[] array = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};
        quick(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quick(Integer[] arr, int l, int r){
        if(l >= r) return;

        int k = arr[l];
        int i = l;
        int j = r;
        while(i < j){
            while(i < j && arr[j] > k){
                j--;
            }
            arr[i] = arr[j];
            arr[j] = k;
            while(i<j && arr[i] < k){
                i++;
            }
            arr[j] = arr[i];
            arr[i] = k;
        }
        quick(arr, l, i);
        quick(arr, i+1, r);
    }

    @Override
    public void sort(Integer[] array) {
        quick(array, 0, array.length-1);
    }
}
