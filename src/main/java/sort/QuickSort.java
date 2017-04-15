package sort;

/**
 * 快速排序
 * Created by Zhao Li on 2017/4/13.
 */
public class QuickSort implements Sorting{

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

    @Override
    public String getName() {
        return "QuickSort";
    }
}
