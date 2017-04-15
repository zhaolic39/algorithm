package sort;

import java.util.Arrays;

/**
 * 归并排序
 * Created by Zhao Li on 2017/4/15.
 */
public class MergeSort implements Sorting{
    @Override
    public void sort(Integer[] array) {
        merge(array, 0, array.length-1);
    }

    private void merge(Integer[] array, int l, int r){
        if(r > l){
            int mid = (l + r)/2;
            merge(array, l, mid);
            merge(array, mid+1, r);
            mergeArray(array, l, mid, r);
            System.out.println(Arrays.toString(array));
        }
    }

    private void mergeArray(Integer[] array, int l, int m, int r){
        Integer[] a1 = new Integer[r-l+1];

        int i =l;
        int j = m+1;
        int z = 0;
        while (i<=m && j<=r){
            if(array[i] < array[j]){
                a1[z] = array[i];
                i++;
            }
            else{
                a1[z] = array[j];
                j++;
            }
            z++;
        }
        while(i<=m){
            a1[z] = array[i];
            z++;
            i++;
        }
        while(j<=r){
            a1[z] = array[j];
            z++;
            j++;
        }

        for(int k=0;k<a1.length;k++){
            array[l + k] = a1[k];
        }
    }

    @Override
    public String getName() {
        return "MergeSort";
    }
}
